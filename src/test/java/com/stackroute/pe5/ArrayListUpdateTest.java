package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListUpdateTest {
    ArrayListUpdate arrayListUpdate;
    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables

        this.arrayListUpdate= new ArrayListUpdate();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables

        arrayListUpdate = null;
    }


    @Test
    public  void givenArrayElementsShouldReturnUpdatedElements(){
        ArrayList<List> result=arrayListUpdate.updateArray();
        ArrayList a=new ArrayList();
        a.add("Kiwi");
        a.add("Grape");
        a.add("Mango");
        a.add("Berry");


        assertEquals(a,result);
    }
    @Test
    public  void givenArrayElementsShouldReturnUpdatedElement(){
        ArrayList<List> result=arrayListUpdate.updateArray();
        ArrayList a=new ArrayList();
        a.add("Kiwi");
        a.add("Grape");
        a.add("Mango");
        a.add("Banana");


        assertNotEquals(a,result);
    }
}