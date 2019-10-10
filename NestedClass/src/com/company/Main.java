package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
	// write your code here

//        Gearbox gb1 = new Gearbox(6);
//        gb1.addGear(1,3.2);
//        gb1.addGear(2,5.3);
//        gb1.addGear(3,8.0);

//        gb1.operateClutch(true);
//        gb1.changeGear(1);
//        gb1.operateClutch(false);
//        System.out.println( gb1.wheelSpeed(3000));
//        gb1.changeGear(2);
//        System.out.println( gb1.wheelSpeed(3000));
//        gb1.operateClutch(true);
//        gb1.changeGear(1);
//        gb1.operateClutch(false);
//        System.out.println(gb1.wheelSpeed(3000));


        // button stuff

        // this is a local class
//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title){
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());
//        listen();


        // anonymous
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title+" was print in anonymous class");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
