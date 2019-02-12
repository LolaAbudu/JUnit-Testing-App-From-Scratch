package org.pursuit.junit_testingappfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StringManipulator extends AppCompatActivity {

    private static StringManipulator myOneInstance;

    public static StringManipulator getSingleInstance() {
        if (myOneInstance != null) {
            return myOneInstance;
        }
        return myOneInstance = new StringManipulator();
    }

    private StringManipulator() {}


    public boolean isLessThan10(String input) {
        if(input == null || input.length() < 10){
                return true;
        }
            return false;
    }

    public boolean isOddLength(String input){
        if(input == null || input.length() % 2 == 0){
            return false;
        }
        return true;
    }

    public String zipperWords(String first, String second){
        if(first == null && second == null){
            return "";
        }
        String newWord = "";
        if(first.length() > second.length()) {
            for (int i = 0; i < second.length(); i++) {
                newWord += first.charAt(i) + "" + second.charAt(i);
            }
            return newWord + first.substring(second.length());
        } else {
            for (int i = 0; i < first.length(); i++) {
                newWord += first.charAt(i) + "" + second.charAt(i);
            }
            return newWord + second.substring(first.length());
        }
    }

    public String deconstructedWord(String word){
        if(word == null){
            return "";
        }
        String vowels = "";
        String constants = "";
        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' ){
                vowels += word.charAt(i);
            }else {
                constants += word.charAt(i);
            }
        }
        return constants + " " + vowels;
    }

    public int wordSum(String first, String second){
        if(first == null || second == null){
            return 0;
        }
        int sumFirst = first.length();
        int sumSecond = second.length();
        return sumFirst + sumSecond;
    }

    public String longestWord(String[] words){
        if(words == null){
            return "";
        }
        String longest = words[0];
        for(int i = 1; i < words.length; i++){
           if(longest.length() < words[i].length()){
                longest = words[i];
           }
       }
       return longest;
    }

    public String[] wordSort(String[] words){
        if(words == null){
           return null;
        }
        String tempWord = "";
        for(int i = 0; i < words.length ; i++){
            for (int j = 0; j < words.length ; j++){
                if(words[i].length() < words[j].length()){
                    tempWord = words[j];
                    words[j] = words[i];
                    words[i] = tempWord;
                }
            }

        }
        return words;
    }
}
