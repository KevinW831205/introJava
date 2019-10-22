package com.company;

public class Labrador extends Dog {
    public Labrador(String name) {
        super(name);
    }

    // will create issue with assymetrical as Dog is not an instance of Labrador
//    @Override
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//
//        if(obj instanceof Labrador){
//            String objName = ((Labrador) obj).getName() ;
//            return this.getName().equals(objName);
//        }
//
//        return false;
//    }

}
