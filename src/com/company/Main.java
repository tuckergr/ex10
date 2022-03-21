package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ContactBook myContacts = new ContactBook();

        //this is my display method rather than "Main.main()"
        for(Contact a: myContacts){
            System.out.println(a);
        }
    }
}

class Contact{
    private String emailAddress;
    private String name;

    public Contact(String emailAddress, String name) {
        this.emailAddress = emailAddress;
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "'s Contact Information: " +
                emailAddress;}
}

class ContactBook implements Iterable<Contact>{
    private ArrayList<Contact> listOfContacts = new ArrayList<Contact>();

    public ContactBook(){
        listOfContacts.add(new Contact("tom23@gmail.com","tom harrold"));
        listOfContacts.add(new Contact("sallyseldz@yahoo.com","sally selder"));
    }

    @Override
    public Iterator<Contact> iterator() {
        return listOfContacts.iterator();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "listOfContacts=" + listOfContacts +
                '}';
    }
}