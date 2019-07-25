package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AscendingOrderTest {
    AscendingOrder ascendingOrder;
    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables

        this.ascendingOrder = new AscendingOrder();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables

        ascendingOrder = null;
    }
    @Test
    public void givenStringShouldReturnOutputInAlphabeticalOrder() {
        ArrayList<String> result = ascendingOrder.ascendingSort("Harry Olive Alice Bluto Eugene");
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Eugene");
        arr.add("Harry");
        arr.add("Olive");
        assertEquals(arr, result);
    }
    @Test
    public void givenAStringShouldReturnOutputInAlphabeticalOrder() {
        ArrayList<String> result = ascendingOrder.ascendingSort("Stackroute CGI LTI Accenture Google");
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Accenture");
        arr.add("CGI");
        arr.add("Google");
        arr.add("LTI");
        arr.add("Stackroute");
        assertEquals(arr, result);
    }
    @Test
    public void givenTheStringShouldReturnOutputInAlphabeticalOrder() {
        ArrayList<String> result = ascendingOrder.ascendingSort("a b c d e");
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("b");
        arr.add("c");
        arr.add("e");
        arr.add("d");
        arr.add("a");
        assertNotEquals(arr, result);
    }


}