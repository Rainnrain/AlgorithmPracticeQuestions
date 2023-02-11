package com.cydeo.PhoneBook.mine;

public class PhoneBookNode {
    public Contact contact;
    public PhoneBookNode next;

    public PhoneBookNode(Contact contact) {
        this.contact = contact;
    }
}
