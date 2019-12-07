package com.company;

public class LisaWorkbook {

    public static void main(String[] args) {

        System.out.println(workbook(5, 3, new int[]{4, 2, 6, 1, 10}));
    }

    static int workbook(int n, int k, int[] arr) {
        // n chapters, k problems/page, arr problems/chapter
        int pageNumber = 1;
        int result = 0;
        int problemsOnPage = 0;


        for (int i = 0; i < arr.length; i++) {
            int problemsPerChapter = arr[i];
            problemsOnPage = 0;

            for (int problemNo = 1; problemNo <= problemsPerChapter; problemNo++) {
                problemsOnPage++;
                if (problemNo == pageNumber) {
                    result++;
                }
                if (problemsOnPage == k && problemNo != problemsPerChapter) {
                    pageNumber++;
                    problemsOnPage = 0;
                }

            }

            pageNumber++;
        }
        return result;
    }

}
