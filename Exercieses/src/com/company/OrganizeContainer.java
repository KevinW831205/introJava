package com.company;

public class OrganizeContainer {

    public static void main(String[] args) {
        int[][] test = new int[][]{new int[]{0,2,1}, new int[]{1,1,1}, new int[]{2,0,0}};
        System.out.println(organizingContainers(test));
    }

    static String organizingContainers(int[][] container) {

        int[] ballsPerType = new int[container.length];
        int[] ballsPerContainer = new int[container.length];




        for(int i =0; i<container.length; i++){
            for(int j =0; j<container.length; j++){
                ballsPerContainer[j] += container[i][j];
                ballsPerType[j] += container[j][i];
            }
        }

        System.out.println("per container");
        for(int s : ballsPerContainer){
            System.out.println(s);
        }
        System.out.println("per type");

        for(int s : ballsPerType ){
            System.out.println(s);
        }

        return "";

//        for(int i=0; i<container.length; i++){
//            int horizontal = 0;
//            int vertical = 0;
//            for(int j=0; j<container.length;j++){
//                if(i != j){
//                    horizontal+= container[i][j];
//                    vertical += container[j][i];
//                }
//            }
//
//            if(horizontal != vertical){
//                return "impossible";
//            }
//        }
//        return "possible";
    }

}
