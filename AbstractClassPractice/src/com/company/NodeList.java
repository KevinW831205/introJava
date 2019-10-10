package com.company;

public interface NodeList {
    ItemStored getRoot();
    boolean addItem(ItemStored item);
    boolean removeItem(ItemStored item);
    void traverse(ItemStored root);


}
