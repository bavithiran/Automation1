package com.uiautomation.pages.hashtable;

public class ContactBookTest {
 
    public static void main(String[] args) {
 
        ContactBook book = new ContactBook();
        book.addContact("bavithiran", "bavithiran@Chatly.in");
        book.addContact("Messi", "Messi@Chatly.in");
        book.addContact("DeJong", "DeJong@Chatly.in");
        book.addContact("Romas", "Romas@Chatly.in");
 
        System.out.println("> Find contact");
        book.findEmailAddress("bavithiran");
        book.findEmailAddress("Messi");
        book.listAllContacts();
 
        System.out.println("> Remove contact");
        book.deleteContact("Romas");
        book.listAllContacts();
    }
 
}