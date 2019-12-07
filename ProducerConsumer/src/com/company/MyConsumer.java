package com.company;

import java.util.List;

import static com.company.Main.EOF;

public class MyConsumer implements Runnable{
    private List<String> buffer;
    private String color;

    public MyConsumer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        while (true){
            if(buffer.isEmpty()){
                continue;
            }
            if(buffer.get(0).equals(EOF)){
                System.out.println(color+"Exiting");
                break;
            } else {
                System.out.println(color + "Removed "+buffer.remove(0));
            }
        }
    }
}
