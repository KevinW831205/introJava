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

    public void addContact(String name, String phoneNumber) {
        Contact contactEntry = new Contact(name, phoneNumber);
        contactList.add(contactEntry);
    }

    public void modifyContact(String name, String newName, String newNumber) {
        int position = findContactByName(name);
        Contact newContact = new Contact(newName, newNumber);
        if (position >= 0) {
            modifyContact(position, newContact);
            System.out.println("Updated contact " + name);
        } else {
            System.out.println("couldn't find contact");
        }
    }

    private void modifyContact(int position, Contact updatedContact) {
        contactList.set(position, updatedContact);
    }

    public void removeContact(String name) {
        int position = findContactByName(name);
        if (position >= 0) {
            contactList.remove(position);
            System.out.println("Removed " + name);
        } else {
            System.out.println("Couldn't find " + name + " in contact");
        }
    }

    public int findContactByName(String name) {
        System.out.println("find contact by name");
        name = name.toLowerCase();
        for (int i = 0; i < contactList.size(); i++) {
            String contactName = contactList.get(i).getName();
            System.out.println("input name " + name);
            System.out.println("list name " + contactList.get(i).getName().toLowerCase());
            System.out.println(name == contactName);
            if (name == contactName) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }

    public boolean contactExists(String name) {
        if (findContactByName(name) >= 0) {
            return true;
        }
        return false;
    }
}
