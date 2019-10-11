package com.company;

import java.util.List;

public class PracticeLinkedList implements NodeList {

    private ItemStored root = null;

    public PracticeLinkedList(ItemStored root) {
        this.root = root;
    }

    @Override
    public ItemStored getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ItemStored item) {
        if (root == null) {
            this.root = item;
            return true;
        }

        ItemStored currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.comparedTo(item);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item).setPrevious(currentItem); // combined with next line as setNext(item) returns item
//                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous()); // combined with next line
//                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);  // combined with next line
//                    currentItem.setPrevious(item);
                } else {
                    item.setNext(this.root).setPrevious(item);
//                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                System.out.println(item.getValue() + " is already added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ItemStored item) {

//        item.previous().setNext(item.next());
//        item.next().setPrevious(item.previous());

        if(item != null){
            System.out.println("Deleting item "+item.getValue());
        }

        ItemStored currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.comparedTo(item);
            if(comparison == 0){
                if(currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison<0) {
                currentItem = currentItem.next();
            } else {
                // greater than item so item can't exist
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ItemStored root) {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
