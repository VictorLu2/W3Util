package com.victor.utilities.DataStructures.Map.HashMap;

import java.util.HashMap;

public class ExampleOfHashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo2");    //  Duplicate key (Overwrites the previous value)
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

//        System.out.println(capitalCities.get("England"));

//        capitalCities.remove("England");
//        System.out.println(capitalCities);

//        capitalCities.clear();
//        System.out.println(capitalCities);

//        System.out.println(capitalCities.size());

//        for (String i : capitalCities.keySet()){
//            System.out.println(i);
//        }

//        for (String i : capitalCities.values()){
//        System.out.println(i);
//        }

//        for (String i : capitalCities.keySet()) {
//            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
//        }
    }
}
