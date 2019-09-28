package com.company;

public class secondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString (int minutes, int seconds){
        if(minutes<0 || seconds<0 || seconds>59){
            return INVALID_VALUE_MESSAGE;
        } else {
            int hour = (int) Math.floor(minutes/60);
            int min = minutes%60;

            String hourS = addZero(hour);
            String minS = addZero(min);
            String secondS = addZero(seconds);

            return hourS+"h "+minS+"m "+secondS+"s";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds<0){
            return  INVALID_VALUE_MESSAGE;
        }

        int minutes = (int) Math.floor(seconds/60);
        return getDurationString(minutes,seconds%60);
    }

    public static String addZero(int a){
        if(a<10){
            return "0"+a;
        } else{
            return Integer.toString(a);
        }
    }


}
