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
            ByteBuffer buffer = ByteBuffer.allocate(100);

            // chained
//            byte[] outputBytes = "Hello World!".getBytes();
//            byte[] outputBytes2 = "nice to meet you".getBytes();
//            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
//            buffer.flip();
//            binChannel.write(buffer);

            byte[] outputBytes = "Hello World!".getBytes();
            buffer.put(outputBytes);
            long int1Pos = outputBytes.length;
            buffer.putInt(245);
            long int2Pos = int1Pos+ Integer.BYTES;
            buffer.putInt(-98765);
            byte[] outputBytes2 = "nice to meet you".getBytes();
            buffer.put(outputBytes2);
            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
            buffer.putInt(1000);
            buffer.flip();
            binChannel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile("data.dat","rwd");
            FileChannel channel = ra.getChannel();
            // reading in different order
            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
            channel.position(int3Pos);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int3 = "+readBuffer.getInt());

            readBuffer.flip();
            channel.position(int1Pos);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int1 = "+readBuffer.getInt());

            readBuffer.flip();
            channel.position(int2Pos);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int2 = "+readBuffer.getInt());

            RandomAccessFile copyFile = new RandomAccessFile("dataCopy.dat","rw");
            FileChannel copyChannel = copyFile.getChannel();
            channel.position(0);
            long numTransferred = copyChannel.transferFrom(channel, 0, channel.size());
            System.out.println("Num Transferred = "+numTransferred);

            channel.close();
            ra.close();
            copyChannel.close();

//             // writing sequentially
//            byte[] outputString = "Hello, World".getBytes();
//            long str1Pos = 0;
//            long newInt1Pos = outputString.length;
//            long newInt2Pos = newInt1Pos + Integer.BYTES;
//            byte[] outputString2 = "Nice to meet you".getBytes();
//            long str2Pos = newInt2Pos + Integer.BYTES;
//            long newInt3Pos = str2Pos + outputString2.length;
//
//            ByteBuffer intBUffer = ByteBuffer.allocate(Integer.BYTES);
//            intBUffer.putInt(245);
//            intBUffer.flip();
//            binChannel.position(newInt1Pos);
//            binChannel.write(intBUffer);
//
//            intBUffer.flip();
//            intBUffer.putInt(-98765);
//            intBUffer.flip();
//            binChannel.position(newInt2Pos);
//            binChannel.write(intBUffer);
//            intBUffer.flip();
//            intBUffer.putInt(1000);
//            binChannel.position(newInt3Pos);
//            binChannel.write(intBUffer);
//
//            binChannel.position(str1Pos);
//            binChannel.write(ByteBuffer.wrap(outputString));
//            binChannel.position(str2Pos);
//            binChannel.write(ByteBuffer.wrap(outputString2));


                    // read sequentialy
//            ByteBuffer readBuffer = ByteBuffer.allocate(100);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            byte[] inputString = new byte[outputBytes.length];
//            readBuffer.get(inputString);
//            System.out.println("input String = "+new String(inputString));
//            System.out.println("int1 = "+readBuffer.getInt());
//            System.out.println("int2 = "+readBuffer.getInt());
//            byte[] inputString2 = new byte[outputBytes2.length];
//            readBuffer.get(inputString2);
//            System.out.println("input String 2 = "+ new String(inputString2));
//            System.out.println("int3 = "+readBuffer.getInt());



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
