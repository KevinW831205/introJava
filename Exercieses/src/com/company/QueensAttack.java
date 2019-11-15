package com.company;

public class QueensAttack {
    public static void main(String[] args) {

        int[][] obstacles = new int[][]{ new int[]{4,4} };

        System.out.println(queensAttack(5, 1, 3, 3, obstacles));

    }

    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int rowCanMoveAbove = n - r_q;
        int rowCanMoveBelow = r_q - 1;
        int rowCanMoveLeft = c_q - 1;
        int rowCanMoveRight = n - c_q;
        int blockUpLeft = Math.min(Math.abs(n - r_q), Math.abs(c_q - 1));
        int blockUpRight = Math.min(Math.abs(n - r_q), Math.abs(n - c_q));
        int blockDownLeft = Math.min(Math.abs(r_q - 1), Math.abs(c_q - 1));
        int blockDownRight = Math.min(Math.abs(r_q - 1), Math.abs(n - c_q));

        if(k > 0){
            for(int[] obstacle : obstacles){
                System.out.println(obstacle[1]);
            }

//            for (int i = 0; i < obstacles.length; i++) {
//                // in same column
//                if(obstacles[i][0] == r_q){
//                    if(obstacles[i][1] > c_q){
//                        // above
//                        if(Math.abs(obstacles[i][1] - c_q - 1) < rowCanMoveAbove){
//                            rowCanMoveAbove = obstacles[i][1] - c_q -1;
//                        }
//
//                    } else if(obstacles[i][1] < c_q){
//                        // below
//                    }
//                }
//            }
        }



        return rowCanMoveAbove + rowCanMoveBelow + rowCanMoveLeft + rowCanMoveRight + blockUpLeft + blockUpRight + blockDownLeft + blockDownRight;

    }

}
