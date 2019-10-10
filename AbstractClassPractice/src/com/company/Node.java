package com.company;

public class Node extends ItemStored{

    public Node(Object value) {
        super(value);
    }

    @Override
    ItemStored next() {
        return this.nextItem;
    }

    @Override
    ItemStored setNext(ItemStored item) {
        this.nextItem = item;
        return this.nextItem;
    }

    @Override
    ItemStored previous() {
        return this.previousItem;
    }

    @Override
    ItemStored setPrevious(ItemStored item) {
        this.previousItem = item;
        return this.previousItem;
    }

    @Override
    int comparedTo(ItemStored item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }


}
