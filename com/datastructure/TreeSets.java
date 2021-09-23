package com.datastructure;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        SortedSet<String> countries = new TreeSet<>();

        countries.add("Namibia");
        countries.add("Rwanda");
        countries.add("Tunisia");

        System.out.println(countries);

        System.out.println("Try adding a duplicate country");
        countries.add("Namibia");

        System.out.println("Let's print out the countries after adding Namibia, again.");
        System.out.println(countries);

        countries.add("Angola");
        System.out.println(countries);
        System.out.println("Note that it sorts alphabetically, ascending");

        countries.remove("Namibia");
        System.out.println(countries);
    }
}
