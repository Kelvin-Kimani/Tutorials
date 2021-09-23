package com.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {

        //Does not store duplicate values, hence will print out Kelvin and Kimani only
        Set<String> hSet = new HashSet<>();

        hSet.add("Kelvin");
        hSet.add("Kelvin");
        hSet.add("Kelvin");
        hSet.add("Kelvin");
        hSet.add("Kimani");

        Iterator<String> names = hSet.iterator();
        while (names.hasNext()){
            System.out.println(names.next());
        }

    }
}
