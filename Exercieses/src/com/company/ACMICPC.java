package com.company;

public class ACMICPC {

    public static void main(String[] args) {
        int[] res = acmTeam(new String[]{"19191","11100","11010","00101"});

        for(int s : res){
            System.out.println(s);
        }

    }

    static int[] acmTeam(String[] topic) {

        int maxAmount =0;
        int possibleArrangements = 0;

        for(int i =0; i<topic.length -1; i++){
            for(int j = i+1; j< topic.length; j++){
                int amount = 0;

                for(int k = 0; k<topic[i].length(); k++){
                    if(topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1'){
                        System.out.println("amount++");
                        amount++;
                    }
                }

                if(amount > maxAmount){
                    maxAmount = amount;
                    System.out.println(maxAmount);
                    possibleArrangements = 1;
                } else if(amount == maxAmount){
                    possibleArrangements++;
                }

            }
        }

        return new int[]{maxAmount, possibleArrangements};
    }



}
