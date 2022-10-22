package com.cydeo.PhoneBook;

public class Test {

    public static void main(String[] args) {


        Entry entry= new Entry("Lorraine", "Cannom", "LorraineCannom@gmail.com", "519-878-8875");
        Entry entry2= new Entry("Ramazan", "Cetintas", "RamazanCetintas@gmail.com", "519-871-8875");

        PhoneBook phoneBook= new PhoneBook<>();
        phoneBook.addToPhoneBook(entry);
        phoneBook.addToPhoneBook(entry2);

     phoneBook.printPhoneBook();

     //   System.out.println(phoneBook.findAll());
     phoneBook.findByName("Lorraine");

     phoneBook.deleteByName("Lorraine");
        System.out.println(2);
        phoneBook.findByName("Lorraine");
        phoneBook.printPhoneBook();
    }
}
