package com.company;

interface Accessible {   // package private accessible within the package com.company
    int SOME_CONSTANT = 100;      // public
    public void methodA();        // public
    void methodB();               // public
    boolean methodC();            // public, all interface methods and variables are public
}
