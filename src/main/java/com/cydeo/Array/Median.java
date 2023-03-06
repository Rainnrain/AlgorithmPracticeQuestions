package com.cydeo.Array;

import java.util.ArrayList;
import java.util.List;

public class Median {
//https://leetcode.com/problems/median-of-two-sorted-arrays/
    public static void main(String[] args) {
        int [] a={1,2};
        int [] b={3,4};
        System.out.println(findMedianSortedArrays(a, b));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> list= new ArrayList<>();

        int p1=0;
        int p2=0;
        while(list.size()<nums1.length+nums2.length){

            if(p1<nums1.length && p2<nums2.length){

                if(nums1[p1]<nums2[p2]){
                    list.add(nums1[p1++]);
                }else{
                    list.add(nums2[p2++]);
                }
            }else{

                if(p1<nums1.length){
                    list.add(nums1[p1++]);
                }else if(p2<nums2.length){
                    list.add(nums2[p2++]);
                }
            }
        }
        if(list.size()%2==0){
            double right= list.get(list.size()/2);
            double left=list.get(list.size()/2-1);
            return (right+left)/2;
        }
        double middle=list.get(list.size()/2);
        return middle;
    }
}
