package com.cydeo.PhoneBook;

public class Test {

    public static void main(String[] args) {


        Contact entry= new Contact("Lorraine", "Cannom", "LorraineCannom@gmail.com", "519-878-8875");
        Contact entry2= new Contact("Ramazan", "Cetintas", "RamazanCetintas@gmail.com", "519-871-8875");



        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addToPhoneBook(entry);
        phoneBook.addToPhoneBook(entry2);
        phoneBook.printPhoneBook();
        System.out.println("--------------------");
      //  phoneBook.deleteByFirstName("Lorraine");
        System.out.println(phoneBook.isEmpty());
        System.out.println(phoneBook.size());
        phoneBook.printPhoneBook();


    }
}
