package com.cydeo.map;

import java.util.*;

public class SubDomainVisits {

  //  https://leetcode.com/problems/subdomain-visit-count/

    public static void main(String[] args) {
        String[] st={"9001 discuss.leetcode.com"};
        System.out.println( subdomainVisits(st));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> freq= new HashMap<>();

        for(int i=0; i<cpdomains.length; i++){
            String word=cpdomains[i];

            String [] listOfDm=word.split("[. ]");
            int val=Integer.valueOf(listOfDm[0]);
            String domain="";
            for(int j=listOfDm.length-1; j>0; j--){
                if(!domain.equals("")) domain="."+domain;
                domain=listOfDm[j]+domain;
                freq.put(domain,freq.getOrDefault(domain,0)+ val);

            }
        }
        ArrayList<String> s= new ArrayList<>();
        for (Map.Entry<String, Integer> each : freq.entrySet()) {
            s.add(each.getKey()+" "+each.getValue());
        }
        return s;
    }

    public List<String> subdomainVisits2(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String dom : cpdomains){
            String s[]= dom.split("[. ]");
            int val=Integer.valueOf(s[0]);
            String domain="";
            for(int i=s.length-1;i>0;i--){
                if(!domain.equals("")) domain="."+domain;
                domain=s[i]+domain;
                map.put(domain,map.getOrDefault(domain,0)+val);
            }
        }
        List<String> list = new ArrayList<>();
        Iterator hmIterator = map.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            String dom = (String)mapElement.getKey();
            int val = (int)mapElement.getValue();
            list.add(val+" "+dom);
        }
        return list;
    }
}
