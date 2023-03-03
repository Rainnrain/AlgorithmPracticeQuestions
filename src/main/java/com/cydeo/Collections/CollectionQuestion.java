package com.cydeo.Collections;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionQuestion {
    public static void main(String[] args) {
List<Integer> ans=new ArrayList<>(Arrays.asList(1,2,28,8,34,5,6));

        System.out.println(boxAverage((ArrayList<Integer>) ans));
    }

    public static int boxAverage(ArrayList<Integer> ans){
      //  var min=Collections.min(ans);
      //  var max=Collections.max(ans);

        int min= ans.get(0);
        int max=ans.get(0);

        for (Integer each : ans) {
            if(each<min) min=each;
            if(each>max) max=each;
        }
return (int) Math.ceil(((float)min+max)/2);
     // return  BigDecimal.valueOf(avg).setScale(0, RoundingMode.HALF_UP).intValue();

    }
}
