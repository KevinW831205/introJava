package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static final String EOF = "End of File";


    public static void main(String[] args) {
        // write your code here
        List<String> buffer = new ArrayList<String>();
        ReentrantLock bufferLock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_RED, bufferLock);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);


        Future<String> future= executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_BLUE + "Printed from callable class");
                return "Callable result";
            }
        });

        try{
            System.out.println(future.get());
        }catch (ExecutionException e){
            System.out.println("something wrong");
        }catch (InterruptedException e ){
            System.out.println("Thread interrupted");
        }

        executorService.shutdown();
    }
}



