package com.cydeo.Fatih.interviewPrepSession5;

import lombok.ToString;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
@ToString
class Node {

        int value;

        public Node(int value) {
            this.value = value;
        }


    }


@ToString
class LRUCache {
        Map<Integer, Node> lastAccessed= new LinkedHashMap<>();
        int capacity;

        public LRUCache(int capacity) {
            this.capacity=capacity;
        }

        public int get(int key) {

            if(lastAccessed.containsKey(key)){

                Node node= lastAccessed.get(key);
                lastAccessed.remove(key);
                lastAccessed.put(key, node);
                return node.value;
            }else{
                return -1;
            }

        }

        public void put(int key, int value) {
            Node node= new Node(value);

            if(lastAccessed.size()==capacity && !lastAccessed.containsKey(key)){

                    Iterator<Map.Entry<Integer, Node>> it = lastAccessed.entrySet().iterator();
                    Map.Entry<Integer, Node> entry = it.next();
                    lastAccessed.remove(entry.getKey());
            }
            if(lastAccessed.containsKey(key)){
                    lastAccessed.remove(key);
                }

            lastAccessed.put(key, node);

            }


//    public void put(int key, int value) {
//        Node node= new Node(value);
//
//        if(lastAccessed.size()<capacity && !lastAccessed.containsKey(key)){
//            lastAccessed.put(key, node);
//
//        }else{
//
//            if(!lastAccessed.containsKey(key)){
//
//                Iterator<Map.Entry<Integer, Node>> it = lastAccessed.entrySet().iterator();
//
//                Map.Entry<Integer, Node> entry = it.next();
//                lastAccessed.remove(entry.getKey());
//
//            }else{
//                lastAccessed.remove(key);
//            }
//            lastAccessed.put(key, node);
//
//        }
  //  }
    }

