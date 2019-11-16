package com.company;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try (FileOutputStream binFile = new FileOutputStream("data.dat");
             FileChannel binChannel = binFile.getChannel();
             ) {

            //writing relative
            ByteBuffer buffer= ByteBuffer.allocate(100);
            byte[] outputBytes = "Hello World!".getBytes();
            byte[] outputBytes2 = "nice to meet you".getBytes();
            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
            buffer.flip();
            binChannel.write(buffer);


//            byte[] outputBytes = "Hello World!".getBytes();
//            buffer.put(outputBytes);
//            buffer.putInt(245);
//            buffer.putInt(-98765);
//            byte[] outputBytes2 = "nice to meet you".getBytes();
//            buffer.put(outputBytes2);
//            buffer.putInt(1000);
//            buffer.flip();
//            binChannel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile("data.dat","rwd");
            FileChannel channel = ra.getChannel();
            ByteBuffer readBuffer = ByteBuffer.allocate(100);
            channel.read(readBuffer);
            readBuffer.flip();
            byte[] inputString = new byte[outputBytes.length];
            readBuffer.get(inputString);
            System.out.println("input String = "+new String(inputString));
            System.out.println("int1 = "+readBuffer.getInt());
            System.out.println("int2 = "+readBuffer.getInt());
            byte[] inputString2 = new byte[outputBytes2.length];
            readBuffer.get(inputString2);
            System.out.println("input String 2 = "+ new String(inputString2));
            System.out.println("int3 = "+readBuffer.getInt());



            //writing text
//            FileInputStream file = new FileInputStream("Data.txt");
//            FileChannel channel = file.getChannel();

//            Path dataPath = FileSystems.getDefault().getPath("Data.txt");
//            Files.write(dataPath, "\nline4".getBytes("UTF-8"), StandardOpenOption.APPEND);
//
//            List<String> lines = Files.readAllLines(dataPath);
//            for(String line : lines){
//                System.out.println(line);
//            }



            //writing binary with try with resource
//
//            byte[] outputBytes = "Hello World!".getBytes();
////            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
//            ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
//            buffer.put(outputBytes);
//            buffer.flip();
//
//            int numBytes = binChannel.write(buffer);
//            System.out.println("numBytes written was: " + numBytes);
//
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            intBuffer.putInt(245);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written was: " + numBytes);
//
//            intBuffer.flip();
//            intBuffer.putInt(-2450);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written was: " + numBytes);
//
//            /*
//            // reading
//            RandomAccessFile ra = new RandomAccessFile("data.dat","rwd");
//            byte[] b = new byte[outputBytes.length];
//            ra.read(b);
//            System.out.println(new String(b));
//
//            long int1 = ra.readInt();
//            long int2 = ra.readInt();
//            System.out.println(int1);
//            System.out.println(int2);
//
//             */
//
//            //reading with NIO
//            RandomAccessFile ra = new RandomAccessFile("data.dat","rwd");
//            FileChannel channel = ra.getChannel();
//            outputBytes[0] = 'a';
//            outputBytes[1] = 'b';
//            buffer.flip();      // reset pointer position
//            long numBytesRead = channel.read(buffer);
//            if(buffer.hasArray()){
//                System.out.println("byte buffer = "+ new String(buffer.array()));
////                System.out.println("byte buffer = " + new String(outputBytes));
//            }
//
//            /*
//            // relative read
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//
//             */
//
//
//            // absolute read
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            System.out.println(intBuffer.getInt(0));
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            System.out.println(intBuffer.getInt(0));
//
//
//            /*
//            //absolute read doesn't move pointer
//            //should keep method consistent
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            System.out.println(intBuffer.getInt(0));
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt(0));
//            //relative read
//            System.out.println(intBuffer.getInt());
//
//             */
//
//
//            channel.close();
//            ra.close();
//



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
