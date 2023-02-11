package com.cydeo.PhoneBook.mine;

import lombok.Data;
import lombok.ToString;

import java.util.*;

@Data
@ToString
public class PhoneBookMine {
    public PhoneBookNode head;
    public PhoneBookNode tail;
    public int size;


    public boolean isEmpty() {
        return head == null;
    }

    public int size() {

        return size;
    }


    public void printPhoneBook() {
        PhoneBookNode current = head;
        while (current != null) {
            System.out.println(current.contact);
            current = current.next;
        }
    }

    public void addToPhoneBook(Contact contact) {

        PhoneBookNode phoneBookNode = new PhoneBookNode(contact);

        if (isEmpty()) head = tail = phoneBookNode;
        else {
            tail.next = phoneBookNode;
            tail = phoneBookNode;
        }
        size++;

    }

    public int findIndexOfElement(String email) {

        PhoneBookNode current = head;
        int index = 0;

        while (current != null) {
            if (current.contact.getEmail().equalsIgnoreCase(email)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public PhoneBookNode findByFirstName(String firstName) {
        PhoneBookNode current = head;
        if (isEmpty())
            throw new NoSuchElementException("The phonebook is empty");
        while (current != null) {
            if (current.contact.getFirstName().equalsIgnoreCase(firstName)) {
                return current;
            }
            current = current.next;
        }
        throw new NoSuchElementException("There is no one by this name");
    }

    public List<PhoneBookNode> findAllByLastName(String LastName) {
        List<PhoneBookNode> ListOfLastNames = new ArrayList<>();
        PhoneBookNode current = head;

        if (isEmpty())
            throw new NoSuchElementException("The phonebook is empty");

        while (current != null) {
            if (current.contact.getLastName().equalsIgnoreCase(LastName)) {
                ListOfLastNames.add(current);
            }
            current = current.next;
        }
        if (ListOfLastNames.isEmpty())
            throw new NoSuchElementException(" Could not find anyone by this name");
        return ListOfLastNames;
    }

    public void deleteByEmail(String email) {
        PhoneBookNode previous = head;
        PhoneBookNode current = head;

        while (current != null) {
            if (current.contact.getEmail().equalsIgnoreCase(email)) {
                if (current == head) {
                    if (size == 1) {
                        head = tail = null;
                    } else {
                        head = current.next;
                    }
                } else if (current == tail) {
                    tail = previous;
                    tail.next = null;
                } else {
                    previous.next = current.next;
                }
                size--;
            }
            previous = current;
            current = current.next;
        }
    }

    public void sortByName() {

        List<PhoneBookNode> sortedList = new ArrayList<>();

        PhoneBookNode current = head;
        while (current != null) {
            sortedList.add(current);
            current = current.next;
        }

        sortedList.sort(Comparator.comparing(p -> p.contact.getFirstName()));
        sortedList.forEach(p -> System.out.println(p.contact));
    }

    public void deleteDuplicates() {
        Set<PhoneBookNode> noDuplicates = new HashSet<>();
        PhoneBookNode current = head;

        while (current != null) {

            if (!noDuplicates.add(current)) ;
            deleteByEmail(current.contact.getEmail());
            current = current.next;
        }
    }


    public void deleteAllMatchingLastName(String LastName) {
        PhoneBookNode previous = head;
        PhoneBookNode current = head;

        while (current != null) {
            if (current.contact.getLastName().equalsIgnoreCase(LastName)) {

                if (current == head) {
                    head = current.next;
                    current.next = null;
                    current = head;
                    previous = head;
                    continue;
                } else if (current == tail) {
                    tail = previous;
                    previous.next = null;

                }
                // case 3 : middle
                else {
                    previous.next = current.next;
                    current.next = null;
                    current = previous.next;
                    continue;

                }
            }
            // after deletion

            previous = current;
            current = current.next;
        }
    }

    public void deleteByFirstNameSezgin(String firstName) {
        //O(n)time  O(1)space
        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in the phoneBook");
        }
        PhoneBookNode previous = head;
        PhoneBookNode current = head;

        while (current != null) {
            if (current.contact.getFirstName().equalsIgnoreCase(firstName)) {
                if (current == head) {
                    if (size == 1) {
                        head = tail = null;
                    } else {
                        head = current.next;
                    }
                } else if (current == tail) {
                    tail = previous;
                    tail.next = null;
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
        throw new NoSuchElementException("This first name" + firstName + " counld not be matched with any record");
    }

    public void deleteAllMatchingLastNameSezgin(String lastName) {
        int startingSize = size();
        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in phone book");
        }
        PhoneBookNode previous = head;
        PhoneBookNode current = head;
        while (current != null) {
            if (current.contact.getLastName().equalsIgnoreCase(lastName)) {
                if (current == head) {
                    if (size == 1) {
                        head = tail = null;
                    } else {
                        head = current.next;
                    }
                } else if (current == tail) {
                    tail = previous;
                    tail.next = null;
                } else {
                    previous.next = current.next;
                    current = previous;
                }
                size--;
            }
            previous = current;
            current = current.next;
        }
        if (startingSize == size) {
            throw new NoSuchElementException("This last name " + lastName + " could not match with any records");
        }

    }

    public List<PhoneBookNode> findAll() {
        List<PhoneBookNode> AllNames = new ArrayList<>();
        PhoneBookNode current = head;
        while (current != null) {
            AllNames.add(current);
            current = current.next;
        }
        return AllNames;
    }


}
