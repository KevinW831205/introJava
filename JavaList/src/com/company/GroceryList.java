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

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("item modified");
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position,newItem);
        }
    }



    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position>=0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        String removed = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("removed "+removed);
    }

    public int findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
//
//        if(exists){
//            int position = groceryList.indexOf(searchItem);
//            return "contains item at position "+position;
//        }else{
//            return "does not contain item";
//        }

        int position = groceryList.indexOf(searchItem);
        return position;
//        if(position >=0){
//            return "contains item at position "+(position+1);
//        } else {
//            return "does not contain item";
//        }
    }

    public boolean onList(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        } else {
            return false;
        }
    }

}
