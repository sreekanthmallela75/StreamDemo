package com.ArraysDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo4 {

        Scanner sc = new Scanner(System.in);

        public boolean removeElement(List<String> list) {
            System.out.println("Enter String to delete");
            String name = sc.next();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(name)) {
                    list.remove(name);
                    return true;
                }
            }
            System.out.println(list);
            return false;
        }

        public void remove(List<String> list) {
            ArrayList<String> newList = new ArrayList<>();
            System.out.println("Enter String to delete");
            String name = sc.next();
            list.stream().filter(x -> x.equals(name)).forEach(x -> newList.add(x));

            if (newList.size() == 0) {
                System.out.println("String Not Found");
            } else {
                list.removeAll(newList);
                System.out.println("remove successfully");
                System.out.println(list);
            }

        }

        public static void main(String[] args) {

            List<String> list = new ArrayList<>();
            list.add("yasin");
            list.add("rohan");
            list.add("raj");
            list.add("rohit");
            System.out.println(list);

            Demo4 demo4 = new Demo4();

//       boolean result = demo4.removeElement(list);
//       if(result){
//           System.out.println("remove successfully");
//           System.out.println(list);
//       }else {
//           System.out.println("String Not Found");
//       }

            demo4.remove(list);
        }
    }

