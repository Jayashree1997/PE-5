package com.stackroute.pe5;

import java.util.*;

public class NumberOfOccurence {
    public String wordCount(String input){
        Map<String,Integer> m=new HashMap<String, Integer>();
        //split the string
        List<String> arr= Arrays.asList(input.split("[\\W_]+"));
        for(String i:arr){
            if (m.containsKey(i)) {
                m.replace(i, m.get(i) + 1);
            } else {
                m.put(i, 1);
            }
        }

        return m.toString();
    }
}