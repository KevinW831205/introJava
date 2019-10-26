package com.company;

public class Main {

    private static StockList stockList = new StockList();
    public static void main(String[] args) {
	// write your code here

        StockItem temp = new StockItem("bread",1.50,100);
        stockList.addStock(temp);

        temp = new StockItem("apple",0.80,30);
        stockList.addStock(temp);


        temp = new StockItem("cake",5.00,20);
        stockList.addStock(temp);

        temp = new StockItem("soda",1.00,50);
        stockList.addStock(temp);

        temp = new StockItem("banana",0.50,30);
        stockList.addStock(temp);



        System.out.println(stockList);

        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }

    }
}
