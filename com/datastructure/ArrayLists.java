package com.datastructure;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        System.out.println(places.size());

        places.add("Abednego");
        places.add("Abednego");
        places.add("Abednego");
        places.add("Abednego");

        //Change an element value at a specified index
        places.set(1,"Changed!");

        System.out.println(places);

        //Get an element value at a specific index
        System.out.println("The element at index 1 is " + places.get(1));
        System.out.println(places.size());

        places.add("Mejja");
        places.add("Okwonko");
        places.add("Matata");

        System.out.println(places);

        places.remove(places.size() - 1);

        System.out.println("After deleting the last element, this is the array " + places);

        //Let's sort the Array(Ascending)
        Collections.sort(places);

        System.out.println(places);

        //Iterating the items using lambda expressions(Never space between the elements)
        places.forEach(a->{
            System.out.println(a);
        });

        System.out.println();

        //Using Iterator class
        Iterator<String> itr = places.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
