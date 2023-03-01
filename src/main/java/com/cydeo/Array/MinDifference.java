package com.cydeo.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinDifference {

    public static void main(String[] args) {
        int [] ar={1,3,6,10,15};
        System.out.println( minimumAbsDifference(ar));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        Integer diff= Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){

            for(int j=1; j<arr.length-1; i++){

                diff=Math.min((Math.abs(arr[i]-arr[j])),diff);
            }
        }
        List<List<Integer>> list= new ArrayList<>();
        for(int k=0; k<arr.length; k++){

            for(int l=1; l<arr.length; l++){

                if( Math.abs(arr[k]-arr[l])==diff){
                    List<Integer> in=new ArrayList<>();
                    int a=Math.min(arr[k], arr[l]);
                    int b=Math.max(arr[k], arr[l]);
                    in.add(a);
                    in.add(b);
                    list.add(in);

                }
            }
        }
       // return list.stream().map(p-> Collections.sort(p)).collect(Collectors.toList())).
       return list.stream().map(p->p.stream().sorted().collect(Collectors.toList())).collect(Collectors.toList());

      //  return list;
    }
}
