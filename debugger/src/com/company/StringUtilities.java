package com.company;

public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;



    public void addChar(StringBuilder sb, char c) {
        this.sBuilder.append(c);
        charsAdded++;
    }
}
