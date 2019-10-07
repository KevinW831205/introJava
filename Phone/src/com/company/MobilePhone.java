package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void printContact(){
        System.out.println("total of "+contactList.size()+" contacts");
        for(int i =0; i<contactList.size();i++){
            System.out.println((i+1)+". "+contactList.get(i));
        }
    }

    public void addContact(String name, String phoneNumber){
        Contact contactEntry = new Contact(name, phoneNumber);
        contactList.add(contactEntry);
    }

    public void modifyContact(){

    }
}
