package com.datastructure;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {

        /*Explicit declaration of length*/
        String[] names = new String[5];

        names[0] = "Jeff";
        names[1] = "Njonjo";

        System.out.println(names);

        /*When array elements are known*/
        String[] employees = {"Maina", "Kamwene", "Umbwedede"};
        for (String employee : employees){
            System.out.println(employee);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people do you want to add?");
        int number = scanner.nextInt();

        String array[] = new String[number];
        System.out.println("Enter the name of the " + number + " guys.");
        for (int i = 0; i<number; i++){
                array[i] = scanner.next();
        }
        System.out.println("The names of the people are: ");
        for (String empName : array){
            System.out.println(empName);
        }

        //Set is an interface
        Set<String> lSet = new LinkedHashSet<>();
        Set<String> tSet = new TreeSet<>();



    }
}
