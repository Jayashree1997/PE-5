package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.TreeSet;

public class AscendingOrder {
        public ArrayList<String> ascendingSort(String s)
        {
            //tree set is initiialised
            TreeSet<String> set =new TreeSet<String>();
            String [] array=s.split(" ");       //words of a string are splitted
            for(int y=0;y<array.length;y++)
            {
                set.add(array[y]);      //splitted words are added into set.
            }
            ArrayList<String> ar=new ArrayList<String>(set);   //set is converted to arraylist
            return ar;
        }
    }


