package com.projectDemo;

import java.util.*;
import java.util.stream.Collectors;

public class SportChatbox {

    public static <Player> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SportsPerson> arrayList = new ArrayList<>();
        int choice = 0;
        do {
            System.out.println("Please Enter your Choice:\n 1.addPerson \n 2.search");
            choice=sc.nextInt();
            switch (choice){

                case 1:
                    arrayList.add( new SportsPerson("Virat Kohli","Cricket","Not Retired" ));
                    arrayList.add(new SportsPerson("Shikhar Dhawan","Cricket","Not Retired"));
                    arrayList.add(new SportsPerson("Rohith Sharma","Cricket","Not Retired"));
                    arrayList.add(new SportsPerson("Sachin Tendulkar","Cricket","Retired"));
                    arrayList.add(new SportsPerson("M.S. Dhoni","Cricket","Not Retired"));
                    arrayList.add(new SportsPerson("K L Rahul","Cricket","Not Retired"));
                    arrayList.add(new SportsPerson("Hardik Pandya","Cricket","Not Retired"));
                    arrayList.add(new SportsPerson("Ravinder Jadeja","Cricket","Not Retired"));
                    arrayList.add(new SportsPerson("Kuldeep yadav","Cricket","Not Retired"));
                    arrayList.add(new SportsPerson("Kedar jadav","Cricket","Not Retired"));
                    Iterator<SportsPerson> iterator = arrayList.listIterator();

                    System.out.println("--------------------------------------");
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    System.out.println("--------------------------------------");
                    break;

               /* case 2:
                 boolean found=false;
                    System.out.println("Enter name to search player:");
                    String name= sc.next();
                    iterator = arrayList.iterator();
                    while (iterator.hasNext()){
                        SportsPerson p = iterator.next();
                        if (p.getName() == name){
                            System.out.println(p);
                            found=true;
                        }
                    }
                    if (!found){
                        System.out.println("Player not found");
                    }
                    break;

                }*/
                    case 2:

                    sc = new Scanner(System.in);
                    System.out.println("Enter name to search player:- ");
                    String name = sc.next();
                    System.out.println("-----------------------------------");
                        Arrays list = null;
                        List<SportsPerson> searchName = list.stream()
                            .filter(p -> {
                                return p.getName().startsWith(name);
                            })
                            .collect(Collectors.toList());
                    System.out.println(searchName);
                    System.out.println("------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------");
                    System.out.println("List of player who are not retired : ");
                    list.stream().filter(player -> player.getCurrentStatus() == "Not Retired").forEach(System.out::println);
                    System.out.println("---------------------------------------");
                    System.out.println("List of player who are retired: ");
                    list.stream().filter(player -> {
                        return SportsPerson.getCurrentStatus() == "Retired";
                    }).forEach(System.out::println);
                    System.out.println("---------------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------------");
                    System.out.println("List of player who play cricket : ");
                    list.stream().filter(player -> {
                        return player.SportsPerson() == "Cricket";
                    }).forEach(System.out::println);
                    System.out.println("---------------------------------------");
                    System.out.println("List of player who play Basketball : ");
                    list.stream().filter(player -> player.SportChatbox() == "Basketball").forEach(System.out::println);
                    System.out.println("---------------------------------------");
                    System.out.println("List of player who play Hockey : ");
                    list.stream().filter(player -> player.SportChatbox() == "Hockey").forEach(System.out::println);
                    System.out.println("---------------------------------------");
                    System.out.println("List of player who play Kho Kho : ");
                    list.stream().filter(player -> player.SportChatbox() == "Kho Kho").forEach(System.out::println);
                    System.out.println("---------------------------------------");
                    break;
                default;
            }
        } while (choice != 5);
    }
    }
