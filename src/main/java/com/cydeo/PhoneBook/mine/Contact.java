package com.cydeo.PhoneBook.mine;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Contact {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}

