package com.qa.StringManipulation;

import java.util.Collections;

public class StringManipulation {
    public void start(){
        String str1 = "yesterday it was raining";
        String str2 = "today it is sunny";
        System.out.println(str2.toUpperCase() + ", " + str1.toUpperCase());

        String subString1 = str2.substring(0, 11);
        String subString2 = str1.substring(16, 24);
        System.out.println(subString1 + subString2);
    }

    public void stringLen(String string){
        System.out.println(string.length());
    }

    public void stringVert(String string){
        String[] words = string.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public boolean stringSearch(String sentence, String target){
        return sentence.contains(target);
    }
}
