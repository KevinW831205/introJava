package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    //store modify remove query

    public void printContact() {
        System.out.println("total of " + contactList.size() + " contacts");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ". Name: " + contactList.get(i).getName() + "\nNumber: " + contactList.get(i).getPhoneNumber());
        }
    }

    public boolean addContact(Contact contact) {
        if(findContact(contact.getName())>=0){
            System.out.println("Contact on file");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public void modifyContact(String name, Contact newContact) {
        int position = findContact(name);
        contactList.set(position,newContact);
    }



    public void removeContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            contactList.remove(position);
            System.out.println("Removed " + name);
        } else {
            System.out.println("Couldn't find " + name + " in contact");
        }
    }

    private int findContact(Contact contact) {
        return this.contactList.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0; i<this.contactList.size(); i++){
            Contact contact = this.contactList.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }


}
