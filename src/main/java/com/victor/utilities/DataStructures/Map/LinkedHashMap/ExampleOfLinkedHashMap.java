package com.victor.utilities.DataStructures.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class ExampleOfLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Autria", "Wien");
        capitalCities.put("Norway", "Olso");
        capitalCities.put("Norway", "Olso1");   // Duplicate key
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);  // Insertion order

//        System.out.println(capitalCities.get("England"));

//        capitalCities.remove("England");
//        System.out.println(capitalCities);

//        capitalCities.clear();
//        System.out.println(capitalCities);

//        System.out.println(capitalCities.size());

//        for (String i : capitalCities.keySet()) {
//            System.out.println(i);
//        }

//        for (String i : capitalCities.values()) {
//            System.out.println(i);
//        }

//        for (String i : capitalCities.keySet()) {
//            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
//        }
    }
}
