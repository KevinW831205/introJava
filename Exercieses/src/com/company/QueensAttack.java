package com.company;

public class QueensAttack {
    public static void main(String[] args) {

        /*

        8           o                   o

        7           o               o

        6           o           o

        5   o       o       o

        4       o   o   o

        3   o   o   Q   o   o   o   o   o

        2       o   o   o

        1   o       o       o

            1   2   3   4   5   6   7   8


         */

        int[][] obstacles = new int[][]{ new int[]{7,3}, new int[]{1,8} };

        System.out.println(queensAttack(8, 3, 3, 3, obstacles));

    }

    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int rowCanMoveAbove = n - r_q;
        int rowCanMoveBelow = r_q - 1;
        int colCanMoveLeft = c_q - 1;
        int colCanMoveRight = n - c_q;
        int blockUpLeft = Math.min(Math.abs(n - r_q), Math.abs(c_q - 1));
        int blockUpRight = Math.min(Math.abs(n - r_q), Math.abs(n - c_q));
        int blockDownLeft = Math.min(Math.abs(r_q - 1), Math.abs(c_q - 1));
        int blockDownRight = Math.min(Math.abs(r_q - 1), Math.abs(n - c_q));

        if (k > 0) {
            for (int[] obstacle : obstacles) {
                //in same row
                if (obstacle[0] == r_q) {
                    if (obstacle[1] > c_q) {
                        // right
                        colCanMoveRight = Math.min( colCanMoveRight, Math.abs(c_q - obstacle[1]) -1);

                    } else if (obstacle[1] < c_q) {
                        // left
                        colCanMoveLeft = Math.min(colCanMoveLeft, Math.abs(c_q - obstacle[1]) -1);
                    }
                }

                // in same column
                if (obstacle[1] == c_q) {
                    if (obstacle[0] > r_q) {
                        // above
                        rowCanMoveAbove = Math.min(rowCanMoveAbove, Math.abs(r_q -obstacle[0]) -1);
                    } else if (obstacle[0] < r_q) {
                        // below
                        rowCanMoveBelow = Math.min(rowCanMoveBelow, Math.abs(r_q-obstacle[0])-1);
                    }
                }

                // in diagonal
                if (Math.abs(obstacle[0] - r_q) == Math.abs(obstacle[1] - c_q)) {
                    if (obstacle[0] > r_q && obstacle[1] < c_q) {
                        // up left
                        blockUpLeft = Math.min(blockUpLeft, Math.abs(r_q - obstacle[0]) - 1);
                    } else if (obstacle[0] > r_q && obstacle[1] > c_q) {
                        // up right
                        blockUpRight = Math.min( blockUpRight, Math.abs(r_q - obstacle[0]) - 1);
                    } else if (obstacle[0] < r_q && obstacle[1] < c_q) {
                        // down left
                        blockDownLeft = Math.min( blockDownLeft, Math.abs(r_q - obstacle[0]) - 1);
                    } else if (obstacle[0] < r_q && obstacle[1] > c_q) {
                        //down right
                        blockDownRight = Math.min(blockDownRight,  Math.abs(r_q - obstacle[0]) - 1);
                    }
                }
            }

        }


        return rowCanMoveAbove + rowCanMoveBelow + colCanMoveLeft + colCanMoveRight + blockUpLeft + blockUpRight + blockDownLeft + blockDownRight;

    }

}
