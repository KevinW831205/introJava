package com.company;

public class OrganizeContainer {

    public static void main(String[] args) {

    }

    static String organizingContainers(int[][] container) {

        for(int i=0; i<container.length; i++){
            int horizontal = 0;
            int vertical = 0;
            for(int j=0; j<container.length;j++){
                if(i != j){
                    horizontal+= container[i][j];
                    vertical += container[j][i];
                }
            }

            if(horizontal != vertical){
                return "impossible";
            }
        }




        return "possible";
    }

}
