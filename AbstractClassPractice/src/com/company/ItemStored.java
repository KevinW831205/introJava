package com.company;

public abstract class ItemStored {
    protected ItemStored previousItem = null;
    protected ItemStored nextItem = null;

    protected Object value;

    public ItemStored(Object value) {
        this.value = value;
    }


    abstract ItemStored next();
    abstract ItemStored setNext(ItemStored item);
    abstract ItemStored previous();
    abstract ItemStored setPrevious(ItemStored item);

    abstract int comparedTo(ItemStored item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
