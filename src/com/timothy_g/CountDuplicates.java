package com.timothy_g;

import java.util.*;


public class CountDuplicates {

    //in_array = france, france, spain, germany, france, spain, mexico, canada, canada

    public static void main(String[] args){

            //create the original list of countries as an array of strings
        String[] countries = {"france", "france", "spain", "germany", "france", "spain", "mexico", "canada", "canada"};

            //create a Map
        Map<String, Integer> countryMap = new HashMap<>();

        for (int i = 0; i < countries.length; i++){

            String word = countries[i];

            if (countryMap.containsKey(word)){
                int count = countryMap.get(word);   //get the current count for the country
                countryMap.put(word, count + 1);
            }
            else {
                countryMap.put(word, 1);    //on first occurrence add the country with a count of 1
            }
        }

        Set<String> keys =countryMap.keySet();  //get the keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);   //sort the keys

        for (String key : sortedKeys ) {
            System.out.printf("%-10s%10s%n", key, countryMap.get(key));
            //System.out.println(key.toString() + "  :  " + countryMap.get(key));
        }
    }//end main
}
