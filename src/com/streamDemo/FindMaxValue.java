package com.streamDemo;

import java.util.Arrays;
import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,3,7,44,55,88,99,100,200,500);
        System.out.println("Given Element = " +list);

        Integer max = list.stream().max(Integer::compare).get();// here stream.max()->stream function for maximum value
        System.out.println("max value is:" + max);
    }
}
