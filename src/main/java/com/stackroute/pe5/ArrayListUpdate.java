package com.stackroute.pe5;
import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdate {
    public ArrayList<List> updateArray() {
        ArrayList a1 = new ArrayList();
        a1.add("Apple");
        a1.add("Grape");
        a1.add("Melon");
        a1.add("Berry");
        a1.set(0, "Kiwi");
        a1.set(2, "Mango");
        return a1;
    }

}
