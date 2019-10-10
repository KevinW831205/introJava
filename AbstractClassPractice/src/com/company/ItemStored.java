package com.company;

public abstract class ItemStored {
    protected ItemStored previousItem = null;
    protected ItemStored nextItem = null;

    protected Object value;

    public ItemStored(Object value) {
        this.value = value;
    }
}
