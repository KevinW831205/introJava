package com.company;

import java.util.Map;

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


        Basket basket1 = new Basket("b1");
        Basket basket2 = new Basket("b2");

        putInBasket(basket1,"apple",20);
        putInBasket(basket1,"banana",20);
        putInBasket(basket1,"apple",2000);
        System.out.println(basket1);
        checkOut(basket1);
        System.out.println(basket1);

        temp = new StockItem("banana",0.50,30);
        stockList.addStock(temp);
        putInBasket(basket2,"banana",20);
        removeItem(basket2,"banana",10);
        removeItem(basket2,"banana",30);
        System.out.println(basket2);
        System.out.println(stockList);


    }

    public static int putInBasket(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Invalid item " + item);
            return 0;
        }
        if((stockList.reserveStock(item, quantity)) != 0){
            return basket.addToBasket(stockItem,quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Invalid item " + item);
            return 0;
        }
        if((basket.removeFromBasket(stockItem, quantity)) == quantity){
            return stockList.cancelStock(item,quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem, Integer> item: basket.Items().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.emptyBasket();
    }

}
