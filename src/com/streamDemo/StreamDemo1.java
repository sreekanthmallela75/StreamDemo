package com.streamDemo;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamDemo1 {
    public static void main(String[] args) {
        // Creating an arraylist with the datatype string
        // and storing the elements by adding elements into the list to the reference variable of the Arraylist
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("S");
        arrayList.add("R");
        arrayList.add("I");

        // using Stream.max() method with Comparator
        // Here, the character with maximum ASCII value
        // is stored in variable MAX
        String Max = arrayList.stream().max(Comparator.comparing(String::valueOf)).get();
        System.out.println("Maximum element in the Stream is" + Max);
    }
}
