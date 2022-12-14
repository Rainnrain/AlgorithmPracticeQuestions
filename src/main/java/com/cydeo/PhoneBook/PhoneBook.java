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

   Map<String, PhoneBookNode> nodesMap = new HashMap<>();
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

      nodesMap.put(contact.getFirstName()+" "+contact.getLastName(),phoneBookNode);
   }

   public PhoneBookNode findByFirstName(String firstName){


      PhoneBookNode current= head;
   while(current!=null){
      if(current.contact.getFirstName().equalsIgnoreCase(firstName)){
         return current;
      }
      current=current.next;
   }
   return null;
   }

   public List<PhoneBookNode> findAllByLastName(String LastName){
   List<PhoneBookNode> ListOfLastNames= new ArrayList<>();
      PhoneBookNode current= head;
   while(current!=null){
      if(current.contact.getLastName().equalsIgnoreCase(LastName)){
         ListOfLastNames.add(current);
      }
      current=current.next;
   }
   return ListOfLastNames;
   }

   public void deleteByFirstName(String firstName){
   PhoneBookNode previous= head;
      PhoneBookNode current= head;

   while(current!=null){
      if(current.contact.getFirstName().equalsIgnoreCase(firstName)){
         previous.next=current.next;
      }
      previous=current;
      current=current.next;
   }
   }

   public void deleteAllMatchingLastName(String LastName){
      PhoneBookNode previous= head;
      PhoneBookNode current= head;

      while(current!=null){
         if(current.contact.getLastName().equalsIgnoreCase(LastName)){

         if(current==head){
            head=current.next;
            current.next=null;
            current=head;
            previous=head;
            continue;
         }

         else if(current==tail){
            tail=previous;
            previous.next=null;

         }
         // case 3 : middle
         else{
            previous.next=current.next;
            current.next=null;
            current=previous.next;
            continue;

         }
         }
         // after deletion

         previous=current;
         current=current.next;
      }
   }

   public void deleteByFirstNameSezgin(String firstName){
   //O(n)time  O(1)space
   if(isEmpty()){
      throw new NoSuchElementException("No record is available in the phoneBook");
   }
   PhoneBookNode previous=head;
   PhoneBookNode current=head;

   while(current!=null){
      if(current.contact.getFirstName().equalsIgnoreCase(firstName)){
         if(current==head){
            if(size==1){
               head=tail=null;
            }else{
               head=current.next;
            }
         }else if(current==tail){
            tail=previous;
            tail.next=null;
         }else{
            previous.next=current.next;
         }
         size--;
         return;
      }
      previous=current;
      current=current.next;
   }
   throw new NoSuchElementException("This first name" +firstName+" counld not be matched with any record");
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
   public List <PhoneBookNode> findAll(){
      List<PhoneBookNode> AllNames= new ArrayList<>();
      PhoneBookNode current= head;
      while(current!=null){
        AllNames.add(current);
        current=current.next;
      }
      return AllNames;
   }


}
