package com.cydeo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Demo {



        public static String distance(String line){

            String[] points = line.split("\\) \\(");
            String[] point1 = points[0].substring(1).split(",");
            String[] point2 = points[1].substring(0, points[1].length() - 1).split(",");
            int x1 = Integer.parseInt(point1[0].trim());
            int y1 = Integer.parseInt(point1[1].trim());
            int x2 = Integer.parseInt(point2[0].trim());
            int y2 = Integer.parseInt(point2[1].trim());


            double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            return String.format("%.0f", distance);

        }
        /**
         * Iterate through each line of input.
         */
        public static void main(String[] args) throws IOException {
//            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//            BufferedReader in = new BufferedReader(reader);
//            String line;
//            while ((line = in.readLine()) != null) {
//                String distanceBetween= distance(line);
//                System.out.println(distanceBetween);
//            }
//

            System.out.println(Armstrong("1"));
            System.out.println(arm2(1));
        }



    public static String Armstrong(String line){
        int num= Integer.parseInt(line);

        int digit= 0;
        int sum=0;

        int size=line.length();
        int copy=num;

        while(copy>0){
            digit=copy%10;
            sum+=Math.pow(digit,size);
            copy/=10;

        }
        if(sum==num) return "True";

        return "False";

    }

    public static boolean arm2(int num) {
        int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }

        return (c == b) ? true : false;
    }

}
