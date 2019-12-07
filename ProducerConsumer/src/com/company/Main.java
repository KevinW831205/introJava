package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String EOF = "End of File";



    public static void main(String[] args) {
	// write your code here
        List<String> buffer = new ArrayList<String>();
        MyProducer producer = new MyProducer(buffer,ThreadColor.ANSI_RED);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE);
        MyConsumer consumer2 = new MyConsumer(buffer,ThreadColor.ANSI_CYAN);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}



