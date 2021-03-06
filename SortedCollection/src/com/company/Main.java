package com.company;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();
    public static void main(String[] args) {
	// write your code here

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



        System.out.println(stockList);

        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket myBasket = new Basket("basket1");
        sellItem(myBasket,"apple",2);
        System.out.println(myBasket);

        sellItem(myBasket,"apple",2);
        System.out.println(myBasket);

        sellItem(myBasket,"apple",300);
        System.out.println(myBasket);

        sellItem(myBasket,"something",23);
        System.out.println(myBasket);

        sellItem(myBasket,"cake",5);
        System.out.println(myBasket);

//        temp = new StockItem("pen",1.12);
//        stockList.Items().put(temp.getName(),temp);

        stockList.Items().get("apple").adjustStock(2000);
        System.out.println(stockList);

        stockList.get("apple").adjustStock(100000);
        System.out.println(stockList);

        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()){
            System.out.println(price.getKey()+" costs "+price.getValue());
        }
    }

    public static int sellItem(Basket basket,String item, int quantity){
        StockItem stockitem = stockList.get(item);
        if(stockitem == null){
            System.out.println("Invalid item "+item);
            return 0;
        }

        if(stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockitem,quantity);
            return quantity;
        }

        System.out.println("insufficient stock");
        return 0;
    }
}
