package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList= new ArrayList<String>(); // array list is a constructor

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size() + "items");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("item modified");
    }

    public void removeGroceryItem(int position){
        String removed = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("removed "+removed);
    }

    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
//
//        if(exists){
//            int position = groceryList.indexOf(searchItem);
//            return "contains item at position "+position;
//        }else{
//            return "does not contain item";
//        }

        int position = groceryList.indexOf(searchItem);
        if(position >=0){
            return "contains item at position "+(position+1);
        } else {
            return "does not contain item";
        }
    }
}
