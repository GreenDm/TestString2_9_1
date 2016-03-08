package com.epam;

/**
 * Created by Hrinchenko on 08.03.2016.
 */
public class Mian {
    public static void main(String[] args) {

        String myStr = "abracadabra";

        int firstRa = myStr.indexOf("ra");
        System.out.println(firstRa);
        int lastRa = myStr.lastIndexOf("ra");
        System.out.println(lastRa);
        String sub = myStr.substring(3, 7);
        System.out.println(sub);

        System.out.println(reverseString(myStr));
    }
        public static String reverseString(String strSource){
        String strResult = "";
        char[] strArray = strSource.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--) {
            strResult += strArray[i];
            
        }
        return strResult;
    }
    }

