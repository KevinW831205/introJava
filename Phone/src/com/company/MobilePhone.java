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
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public boolean modifyContact(String name, Contact newContact) {
        int position = findContact(name);
        if (position >= 0) {
            contactList.set(position, newContact);
            System.out.println("updated " + name + " contact information");
            return true;
        } else {
            System.out.println("error " + name + "  was not found");
            return false;
        }
    }

    public boolean removeContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            contactList.remove(position);
            System.out.println("Removed " + name);
            return true;
        } else {
            System.out.println("Couldn't find " + name + " in contact");
            return false;
        }
    }

    public boolean findAndPrint(String name){
        int position = findContact(name);
        if(position>=0){
            System.out.println("Found "+name+"\nnumber: "+contactList.get(position).getPhoneNumber());
            return true;
        } else {
            System.out.println("Can't find "+name);
            return false;
        }

    }


    private int findContact(Contact contact) {
        return this.contactList.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.contactList.size(); i++) {
            Contact contact = this.contactList.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }



}
