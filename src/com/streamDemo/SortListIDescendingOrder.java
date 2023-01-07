package com.streamDemo;

import java.awt.*;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SortListIDescendingOrder {
    public static  void main(String[] args) {
        List<Integer> list =  Arrays.asList(10,20,30,40,50);
        System.out.println("Before sorting:" + list);
       List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("After sorting:" + list1);
    }
}
