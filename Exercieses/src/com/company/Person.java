package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String input){
        this.firstName = input;
    }

    public void setLastName(String input){
        this.lastName = input;
    }

    public void setAge (int input){
        if(input<0 || input>100){
            this.age=0;
        } else{
            this.age = input;
        }
    }

    public boolean isTeen(){
        if(this.age>12 && this.age<20){
            return true;
        }else {
            return false;
        }
    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        } else if(firstName.isEmpty()){
            return this.lastName;
        } else if(lastName.isEmpty()){
            return this.firstName;
        } else{
            return  this.firstName +" "+this.lastName;
        }
    }


}
