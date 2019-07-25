package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringBooleanTest {
    StringBoolean stringBoolean;
    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables

        this.stringBoolean= new StringBoolean();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables

        stringBoolean = null;
    }

    @Test
    public void givenStringArrayShouldReturnCount() {
            Map<String,Boolean> result=stringBoolean.countOccurence(new String[]{"a","b","c","d","a","c","c"});
            Map<String,Boolean> h=new HashMap<String, Boolean>();
            h.put("a",true);
            h.put("b",false);
            h.put("c",true);
            h.put("d",false);
            assertEquals(h,result);
    }
    @Test
    public void givenStringArrayShouldReturnOccurence() {
        Map<String,Boolean> result=stringBoolean.countOccurence(new String[]{"a","b","c","d","a","c","c"});
        Map<String,Boolean> m=new HashMap<String, Boolean>();
        m.put("a",true);
        m.put("b",true);
        m.put("c",true);
        m.put("d",false);
        assertNotEquals(m,result);
    }
}