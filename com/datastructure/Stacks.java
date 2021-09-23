package com.datastructure;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        //Stacking items, so last in, first out
        Stack<String> beers = new Stack<>();

        //Let's add
        beers.push("Tusker");
        beers.push("Guinness");
        beers.push("White Cap");
        beers.push("Faxe");
        beers.push("Master Mind");

        //Alternatively use add
        beers.add("Konyags");

        //Displays the list of elements from the bottom most to the top most
        System.out.println("The list of elements" + beers + "\n");
        //used to retrieve or fetch the first element of the Stack(element present at the top of the Stack)
        System.out.println("The top most element(Last element) is " + beers.peek() + "\n");

        //Print out each element
        System.out.println("All elements are: NB - arranged like a stack with the top most element being " + beers.lastElement()
        + " and the bottom most being " + beers.firstElement());
        for (int i = beers.size() - 1;  i >= 0; i--){
            System.out.println("|" + beers.get(i) + "|");
        }
        System.out.println("______________");

        //Let's delete
        System.out.println("\nAfter deleting the top most element in stack, which is " + beers.lastElement());
        beers.pop();
        System.out.println(beers);

        //Search starts from the top of the stack
        int position = beers.search("Guinness");
        System.out.println("Guinness is on position " + position);

        //Indexing starts from the bottom of the stack
        System.out.println("The first element is " + beers.get(0));
    }
}
