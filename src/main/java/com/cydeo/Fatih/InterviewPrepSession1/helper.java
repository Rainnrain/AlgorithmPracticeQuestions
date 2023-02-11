package com.cydeo.Fatih.InterviewPrepSession1;

import com.cydeo.PhoneBook.mine.PhoneBookNode;

import java.util.Comparator;

public class helper implements Comparator<PhoneBookNode> {


    @Override
    public int compare(PhoneBookNode o1, PhoneBookNode o2) {
        String lastName= o1.contact.getLastName();
        String otherLastName=o2.contact.getLastName();

        return lastName.compareTo(otherLastName);
    }
}
