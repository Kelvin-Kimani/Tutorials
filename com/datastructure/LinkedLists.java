package com.datastructure;

import java.util.LinkedList;
import java.util.List;

/**
 * Implements List and Deque interfaces
 * Below are some methods
 * peek(), First and Last
 *  offer(E e), First and Last
 *  poll() - retrieves and removes first element, First and Last too(remove(), First and Last)
 *  pop() - pops an element from the stack represented by a list.
 *
 */
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(5);

        //Uses methods in Deque(Double Ended Queue). Let's try!
        numbers.addFirst(77);

        numbers.addLast(90);

        int num = 1000;
        int num1 = 500;
        numbers.addAll(List.of(num, num1));

        int [] ar = {120,33};

    System.out.println(numbers);


    }
}
