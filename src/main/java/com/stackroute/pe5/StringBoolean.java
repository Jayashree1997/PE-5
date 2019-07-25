package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class StringBoolean {
    public Map<String,Boolean> countOccurence(String[] input){
        Map<String,Boolean> h1=new HashMap<String,Boolean>();

        for(int x=0;x<input.length;x++){
            int cnt=0;
            for(int y=0;y<input.length;y++){
                if(input[x].equals(input[y])) {
                    cnt++;
                }
            }

            if(cnt>=2) {
                h1.put(input[x],true);
            }
            else{
                h1.put(input[x],false);
            }

        }
        return h1;
    }

}



