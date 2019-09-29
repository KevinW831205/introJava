package com.company;

public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature){

        if(summer && temperature <=45 && temperature>=25){
            return true;
        } else if (temperature>=25 && temperature <=35) {
            return true;
        } else{
            return false;
        }
    }
}
