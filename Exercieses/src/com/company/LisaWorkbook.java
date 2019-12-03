package com.company;

public class LisaWorkbook {

    public static void main(String[] args) {

    }

    static int workbook(int n, int k, int[] arr) {
        // n chapters, k problems/page, arr problems/chapter
        int pageNumber = 1;
        int result = 0;

        for(int i=1; i<=arr.length; i++){
            int problemsPerChapter = arr[i];
            for(int problem=1; problem<=problemsPerChapter; problem++){
                if(problem == pageNumber){
                    result++;
                }
                if(problem == k){
                    pageNumber++;
                }
            }
            pageNumber++;
        }
        return result;
    }

}
