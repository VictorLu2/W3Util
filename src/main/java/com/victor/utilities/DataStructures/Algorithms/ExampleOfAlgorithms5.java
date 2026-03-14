package com.victor.utilities.DataStructures.Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleOfAlgorithms5 {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Jack");
        cards.add("Queen");
        cards.add("King");
        cards.add("Ace");

        Collections.shuffle(cards);
        System.out.println(cards);
    }
}
