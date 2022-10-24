package com.cydeo.PhoneBook;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {


        Contact entry= new Contact("Lorraine", "Cannom", "LorraineCannom@gmail.com", "519-878-8875");
        Contact entry2= new Contact("Ramazan", "Cetintas", "RamazanCetintas@gmail.com", "519-871-8875");
        Contact entry3= new Contact("Leyla", "Cetintas", "RamazanCetintas@gmail.com", "519-871-8875");
        Contact entry4= new Contact("Sema", "Cetintas", "RamazanCetintas@gmail.com", "519-871-8875");
        Contact entry5= new Contact("Leyla", "Cannom", "RamazanCetintas@gmail.com", "519-871-8875");
        Contact entry6= new Contact("Leyla", "Cetintas", "RamazanCetintas@gmail.com", "519-871-8875");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addToPhoneBook(entry2);
        phoneBook.addToPhoneBook(entry3);
        phoneBook.addToPhoneBook(entry);
        phoneBook.addToPhoneBook(entry4);
        phoneBook.addToPhoneBook(entry5);
        phoneBook.addToPhoneBook(entry6);
      phoneBook.printPhoneBook();
       System.out.println("--------------------");
//       phoneBook.deleteByFirstName("Lorraine");
//        System.out.println(phoneBook.isEmpty());
//        System.out.println(phoneBook.size());
     //  System.out.println(phoneBook.findByFirstName("Ramazan").contact);

        phoneBook.deleteAllMatchingLastName("Cetintas");

        phoneBook.printPhoneBook();
//

    }
}
