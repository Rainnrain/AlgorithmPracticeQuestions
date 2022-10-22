package com.cydeo.PhoneBook;

import lombok.Data;
import lombok.ToString;

import java.util.*;

@Data
@ToString
public class PhoneBook <Entry> {

   LinkedList<Entry> data;

   public HashMap<Integer, LinkedList<Entry>> phoneBookData= new HashMap<>();


   public PhoneBook() {

   }

   public  void findByName(String name){

      for (Map.Entry<Integer, LinkedList<Entry>> entry : phoneBookData.entrySet()) {
         for (Entry data : entry.getValue()) {
          if( data.toString().contains(name)){
             System.out.println(entry.getValue());
          }
         }
      }
   }

   public  void findAllByLastName(String lastName){
      for (Map.Entry<Integer, LinkedList<Entry>> entry : phoneBookData.entrySet()) {
         for (Entry data : entry.getValue()) {
            if( data.toString().contains(lastName)){
               System.out.println(entry.getValue());
            }
         }
      }
   }

   public  void deleteByName( String name){
      for (Map.Entry<Integer, LinkedList<Entry>> entry : phoneBookData.entrySet()) {
      for (Entry data : entry.getValue()) {
         if( data.toString().contains(name)){
            entry.getValue().remove();
         }
      }
   }
   }

   public  void deleteAllMatchingLastName(String name){
      for (Map.Entry<Integer, LinkedList<Entry>> entry : phoneBookData.entrySet()) {
         for (Entry data : entry.getValue()) {
            if( data.toString().contains(name)){
               entry.getValue().remove();
            }
         }
      }
   }

   public ArrayList<Entry> findAll(){
      ArrayList <Entry> info= new ArrayList<>();

      for (Map.Entry<Integer, LinkedList<Entry>> each : phoneBookData.entrySet()) {
         for (Entry data : each.getValue()) {
            info.add(data);
         }
      }
      return info;
   }

   public void printPhoneBook(){

      for (Map.Entry<Integer, LinkedList<Entry>> each : phoneBookData.entrySet()) {
         System.out.println(each.getValue());
      }

   }

   public void addToPhoneBook(Entry entry){
      data=new LinkedList<>();
      data.add(entry);
      Integer id= getRandomNumber(0,100000);
   phoneBookData.put(id, data);
   }

   public int getRandomNumber(int min, int max) {
      return (int) ((Math.random() * (max - min)) + min);
   }
}
