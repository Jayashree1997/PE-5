package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfOccurenceTest {
    NumberOfOccurence numberOfOccurence;

    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables

        this.numberOfOccurence = new NumberOfOccurence();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables

        numberOfOccurence = null;
    }

    @Test
    public void givenStringShouldReturnItsCountInHashMap() {
        //check if each element in the string is repeated more than once and count
        String actualResult = numberOfOccurence.wordCount("one one -one___two,,three,one @three*one?two;");
        String result="{one=5, two=2, three=2}";
        assertEquals(result,actualResult);

    }
    @Test
    public void givenStringShouldReturnItsOccurenceInHashMap() {
        //check if each element in the string is repeated more than once and count
        String actualResult = numberOfOccurence.wordCount("one one two three two;");
        String result="{one=2, two=2, three=1}";
        assertEquals(result,actualResult);

    }
    @Test
    public void givenStringShouldReturnItsNoOfOccurenceInHashMap() {
        //check if each element in the string is repeated more than once and count
        String actualResult = numberOfOccurence.wordCount("one two three one one two two three three;");
        String result="{one=3, two=4, three=5}";
        assertNotEquals(result,actualResult);

    }
}