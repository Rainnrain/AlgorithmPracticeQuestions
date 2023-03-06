package com.cydeo.Array;

public class MaxArea {
//https://leetcode.com/problems/container-with-most-water/solutions/

    public static void main(String[] args) {
        int [] ar={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(ar));
        System.out.println(maxAreaLoops(ar));
    }

    public static int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int max = 0;
    while(left < right){
        int w = right - left;
        int h = Math.min(height[left], height[right]);
        int area = h * w;
        max = Math.max(max, area);

        if(height[left] < height[right]) left++;
        else if(height[left] > height[right]) right--;
        else {
            left++;
            right--;
        }
    }
    return max;

}


public static int maxAreaLoops(int[] height){
        int h=0;
        int l=0;
        int area=0;
        int max=0;
    for (int i = 0; i < height.length; i++) {

        for (int j = i+1; j < height.length ; j++) {

            h=Math.min(height[i], height[j]);
            l=j-i;

            area=l*h;

            max=Math.max(area, max);

        }

    }
    return max;
    }
}
