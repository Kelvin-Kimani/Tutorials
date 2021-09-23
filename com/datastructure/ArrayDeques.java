package com.datastructure;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<String> animals = new ArrayDeque<>();

        //Inserts the specified element at the end of this deque(same as addLast)
        animals.add("Ndovu ni kuu");
        System.out.println(animals + "\n");

        animals.add("Simba Marara");
        System.out.println("Let's see if it was added last");
        System.out.println(animals);

        //Same as offerLast
        animals.offer("Sungura Mjanja");
        System.out.println(animals);

        //Adds element at the front of the deque(Same as addFirst)
        animals.offerFirst("Kifaru");
        System.out.println(animals);

        //Retrieves the value at the head(Same as peekFirst)
        System.out.println(animals.peek());

        //Retrieves the value at the tail
        System.out.println(animals.peekLast() + "\n");

        //Retrieves the value at the head(Same as peekFirst, peek)
        System.out.println(animals.getFirst());

        //Retrieves the value at the tail(Same as peekLast)
        System.out.println(animals.getLast() + "\n");

        /**
         * remove, removeFirst returns and removes the head of the deque
         * removeLast removes the element at the tail in the deque
         */

        //Iterator
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        //Descending iterator
        Iterator<String> descIterator = animals.descendingIterator();
        while (descIterator.hasNext()){
            System.out.println(descIterator.next());
        }
    }
}
