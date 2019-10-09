package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DemoList {

    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("place1");
//        placesToVisit.add("place23");
//        placesToVisit.add("place5");
//        placesToVisit.add("place25");
//        placesToVisit.add("place1");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1,"place342");
//        printList(placesToVisit);
//        placesToVisit.set(0,"place2");
//
//
        LinkedList<String> placesToVisit2 = new LinkedList<String>();
        addInOrder(placesToVisit2,"fdfs");
        addInOrder(placesToVisit2,"absdf");
        addInOrder(placesToVisit2,"cdere");
        addInOrder(placesToVisit2,"23sdf");
        printList(placesToVisit2);

        visit(placesToVisit2);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visitng "+i.next());
        }
        System.out.println("==============");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newPlace){
        ListIterator<String> stringListIterator =  linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newPlace);
            if(comparison == 0){
                // equal do not add;
                System.out.println(newPlace + "is already in array list");
                return false;
            } else if(comparison>0){
                // new city should appear before
                // b is in list. newPlace is a
                // the .next() has already moved the stringListIterator down
                stringListIterator.previous();
                stringListIterator.add(newPlace);
                return true;
            } else {
                // move to the next item
            }
        }
        // reached end of list

        stringListIterator.add(newPlace);
        return true;
    }

    public static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForwards = true; // iterators are in between items so to prevent out putting same city when go forward and backwards have this boolean
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("no cities is in list");
            return;
        } else {
            System.out.println("Now visiting "+listIterator.next());
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("visit over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForwards){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForwards = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting "+ listIterator.next());
                    } else {
                        System.out.println( "end of list");
                    }
                    break;
                case 2:
                    if(goingForwards){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForwards = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " +listIterator.previous());
                    } else {
                        System.out.println("at beginning of list");
                    }
                case 3:
                    printMenu();
                    break;

            }
        }
    }
    private static void printMenu(){
        System.out.println("1-quit 2-next city 3-previous city");
    }
}
