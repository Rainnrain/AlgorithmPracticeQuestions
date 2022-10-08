package com.cydeo;

public class AlphabetValue {
    public static void main(String[] args) {


        System.out.println(ExcelSheetColumnNumber("AFQ" ));

    }


    public static int ExcelSheetColumnNumber(String str) {
        char[] arr = { '1','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int column = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < arr.length; j++) {


                if (str.charAt(i) == arr[j]) {

                    column *= 26;
                    column+=j;
                    break;
                }

            }
        }
            return column;
        }

}
