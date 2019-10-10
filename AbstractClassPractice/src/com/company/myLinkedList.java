package com.company;

public class myLinkedList implements NodeList{

    private ItemStored root = null;

    public myLinkedList(ItemStored root) {
        this.root = root;
    }

    @Override
    public ItemStored getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ItemStored item) {
        if(root == null){
            this.root = item;
            return true;
        }

        ItemStored currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.comparedTo(item);
            if(comparison<0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison >0) {
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                } else{
                    item.setNext(this.root);
                    this.root.setPrevious(item);
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
        return false;
    }

    @Override
    public void traverse(ItemStored root) {

    }
}
