package com.cydeo.PhoneBook;



public class PhoneBookApp {

    public static void main(String[] args) {


        Node entry = new Node("Lorraine", "Cannom", "LorraineCannom@gmail.com", "519-888-8875");
        Node entry1 = new Node("Lorraine", "Cannom", "LorraineCannom@gmail.com", "519-888-8875");
        Node entry2 = new Node("Ramazan", "Cetintas", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry3 = new Node("Leyla", "Cetintas", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry4 = new Node("Sema", "Cetintas", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry5 = new Node("aLeyla", "Cannom", "RamazanCetintas@gmail.com", "519-888-8875");
        Node entry6 = new Node("Leyla", "Cetintas", "RamazanCetintas@gmail.com", "519-888-8875");

        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add(entry1);
        phoneBook.add(entry);
        phoneBook.add(entry3);
        phoneBook.add(entry2);
        phoneBook.add(entry4);
        phoneBook.add(entry5);
        phoneBook.add(entry6);

        phoneBook.print();
        System.out.println("----------");
        phoneBook.sortByName();
        phoneBook.print();
    }
}
