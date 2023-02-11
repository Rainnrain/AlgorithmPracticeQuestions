package com.cydeo.PhoneBook.mine;

import java.util.List;

public class Test {

    public static void main(String[] args) {


        Contact entry= new Contact("Lorraine", "Cannom", "LorraineCannom@gmail.com", "519-888-8875");
        Contact entry12= new Contact("Lorraine", "Cannom", "LorraineCannom@gmail.com", "519-888-8875");
        Contact entry2= new Contact("Ramazan", "Cetintas", "RamazanCetintas@gmail.com", "519-888-8875");
        Contact entry3= new Contact("Leyla", "Cetintas", "RamazanCetintas@gmail.com", "519-888-8875");
        Contact entry4= new Contact("Sema", "Cetintas", "RamazanCetintas@gmail.com", "519-888-8875");
        Contact entry5= new Contact("Leyla", "Cannom", "RamazanCetintas@gmail.com", "519-888-8875");
        Contact entry6= new Contact("Leyla", "Cetintas", "RamazanCetintas@gmail.com", "519-888-8875");

        PhoneBookMine phoneBook = new PhoneBookMine();
        phoneBook.addToPhoneBook(entry12);
        phoneBook.addToPhoneBook(entry);
        phoneBook.addToPhoneBook(entry3);
        phoneBook.addToPhoneBook(entry);
        phoneBook.addToPhoneBook(entry4);
        phoneBook.addToPhoneBook(entry5);
        phoneBook.addToPhoneBook(entry6);
    //  phoneBook.printPhoneBook();

      phoneBook.sortByName();
        System.out.println("--------------------");
      phoneBook.printPhoneBook();
    //  phoneBook.deleteDuplicates();
        System.out.println( phoneBook.findIndexOfElement("ramazancetintas@gmail.com"));
       System.out.println("--------------------");


//        System.out.println(phoneBook.isEmpty());
//        System.out.println(phoneBook.size());
     //  System.out.println(phoneBook.findByFirstName("Ramazan").contact);
//phoneBook.deleteAllMatchingLastNameSezgin("Cetintas");
    //   phoneBook.deleteByFirstNameSezgin("Lorraine");
        List<PhoneBookNode> list= phoneBook.findAll();
        for (PhoneBookNode phoneBookNode : list) {
            System.out.println(phoneBookNode.contact);
        }
      //  phoneBook.printPhoneBook();
//

    }
}
