package com.company;

public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal){

        if(bigCount<0 || smallCount <0 || goal<0){
            return false;
        }


        int requiredSmall = goal%5;

        if(requiredSmall > smallCount){
            return false;
        } else {
            goal -= requiredSmall;
            smallCount -= requiredSmall;
            int remaining = (bigCount*5 +smallCount*1);

            if(remaining>=goal){
                return true;
            }else{
                return false;
            }

        }



    }
}
