package com.cydeo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store implements ItemStore{

    Map<String, Item> store= new HashMap();

    public void put(Item item){
        store.put(item.getId(), item);
    }

    public Item get(String id){

        return store.get(id);
    }

    public void dropAllByTag(String tag){

        for (Item each : store.values()) {
            if(each.getTag().equals(tag)){
                store.remove(each.getId());
            }
        }

    }
    public int size(){
       return store.size();
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getTag() {
        return null;
    }
}
