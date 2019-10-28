package com.company;

public class MainPractice {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread",1.50,100);
        stockList.addStock(temp);

        temp = new StockItem("apple",0.80,30);
        stockList.addStock(temp);

        temp = new StockItem("apple",1.2, 10);
        stockList.addStock(temp);

        temp = new StockItem("cake",5.00,20);
        stockList.addStock(temp);

        temp = new StockItem("soda",1.00,50);
        stockList.addStock(temp);

        temp = new StockItem("banana",0.50,30);
        stockList.addStock(temp);

        stockList.get("apple").reserveStock(5);
        stockList.get("apple").cancelReserve(3);

        System.out.println(stockList);

    }
}
