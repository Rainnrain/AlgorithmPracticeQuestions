package com.cydeo.PhoneBook;

import lombok.Data;
import lombok.ToString;
import org.w3c.dom.Node;

import java.util.*;

@Data
@ToString
public class PhoneBook {
public PhoneBookNode head;
public PhoneBookNode tail;
public int size;

public boolean isEmpty(){
   return head==null;
}

public int size(){
   PhoneBookNode current= head;
   if(isEmpty()) return 0;
   int size=0;
   while(current!=null){
      current=current.next;
      size++;
   }
   return size;
}


   public void printPhoneBook(){
      PhoneBookNode current= head;
   while(current!=null){
      System.out.println(current.contact);
      current=current.next;
   }
    }

   public void addToPhoneBook(Contact contact){
   PhoneBookNode phoneBookNode= new PhoneBookNode(contact);
   phoneBookNode.next=head;
   head=phoneBookNode;
   }

   public PhoneBookNode findByFirstName(String firstName){

   while(head!=null){
      if(head.contact.getFirstName().equalsIgnoreCase(firstName)){
         return head;
      }
   }
   return null;
   }

   public List<PhoneBookNode> findAllByLastName(String LastName){
   List<PhoneBookNode> ListOfLastNames= new ArrayList<>();

   while(head!=null){
      if(head.contact.getLastName().equalsIgnoreCase(LastName)){
         ListOfLastNames.add(head);
      }
   }
   return ListOfLastNames;
   }

   public void deleteByFirstName(String firstName){
   PhoneBookNode previous= head;

   while(head!=null){
      if(head.contact.getFirstName().equalsIgnoreCase(firstName)){
         previous.next=head.next;
      }
      previous=head;
      head=head.next;
   }
   }

   public void deleteAllMatchingLastName(String LastName){
      PhoneBookNode previous= head;

      while(head!=null){
         if(head.contact.getFirstName().equalsIgnoreCase(LastName)){
            previous.next=head.next;
         }
         previous=head;
         head=head.next;
      }
   }

   public List <PhoneBookNode> findAll(){
      List<PhoneBookNode> AllNames= new ArrayList<>();

      while(head!=null){
        AllNames.add(head);
        head=head.next;
      }
      return AllNames;
   }

   public int getRandomNumber(int min, int max) {
      return (int) ((Math.random() * (max - min)) + min);
   }
}
