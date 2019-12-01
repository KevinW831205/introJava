package com.company;

import java.util.Random;

public class Writer implements Runnable {
    private Message message;

    public Writer(Message message){
        this.message = message;
    }

    public void run(){
        String messages[] = {
                "some sentence one",
                "some sentence two",
                "some sentence three",
                "some sentence four"
        };

        Random random = new Random();

        for(int i=0; i<messages.length;i++){
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

        message.write("Finished");
    }
}
