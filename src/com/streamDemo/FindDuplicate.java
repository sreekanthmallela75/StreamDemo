package com.streamDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
    //find the Duplicate elements in the list using Stream API
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,5,10,40,5,10,7,9,9,15);
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateNumber = list.stream().filter(item->!set.add(item)).collect(Collectors.toSet());
        duplicateNumber .stream().forEach(System.out::println);
    }
}
