package com.company;

public class QueensAttack {
    public static void main(String[] args) {

        int[][] obstacles = new int[][]{new int[]{4, 4}, new int[]{2, 3}};

        System.out.println(queensAttack(5, 1, 3, 2, obstacles));

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

        if (k > 0) {
            for (int[] obstacle : obstacles) {
                //in same column
                if (obstacle[0] == r_q) {
                    if (obstacle[1] > c_q) {
                        // above
                        if (Math.abs(obstacle[1] - c_q - 1) < rowCanMoveAbove) {
                            rowCanMoveAbove = Math.abs(obstacle[1] - c_q - 1);
                        }
                    } else if (obstacle[1] < c_q) {
                        // below
                        if (Math.abs(c_q - obstacle[1] - 1) < rowCanMoveBelow) {
                            rowCanMoveBelow = Math.abs(c_q - obstacle[1] - 1);
                        }
                    }
                }

                // in same row
                if (obstacle[1] == c_q) {
                    if (obstacle[0] > r_q) {
                        // above
                        if (Math.abs(obstacle[0] - r_q - 1) < rowCanMoveRight) {
                            rowCanMoveAbove = Math.abs(obstacle[1] - c_q - 1);
                        }
                    } else if (obstacle[0] < r_q) {
                        // below
                        if (Math.abs(r_q - obstacle[1] - 1) < rowCanMoveLeft) {
                            rowCanMoveBelow = Math.abs(r_q - obstacle[0] - 1);
                        }
                    }
                }

                // in diagonal
                if (Math.abs(obstacle[0] - r_q) == Math.abs(obstacle[1] - c_q)) {
                    if (obstacle[0] < r_q && obstacle[1] > c_q) {
                        // up left
                        blockUpLeft = r_q - obstacle[0] - 1;
                    } else if (obstacle[0] > r_q && obstacle[1] > c_q) {
                        // up right
                        blockUpRight = obstacle[0] - r_q - 1;
                    } else if (obstacle[0] < r_q && obstacle[1] < c_q) {
                        // down left
                        blockDownLeft = blockUpLeft = r_q - obstacle[0] - 1;
                    } else if( obstacle[0] > r_q && obstacle[1] < c_q){
                        //down right
                        blockDownRight = obstacle[0] - r_q - 1;
                    }
                }
            }

        }


        return rowCanMoveAbove + rowCanMoveBelow + rowCanMoveLeft + rowCanMoveRight + blockUpLeft + blockUpRight + blockDownLeft + blockDownRight;

    }

}
