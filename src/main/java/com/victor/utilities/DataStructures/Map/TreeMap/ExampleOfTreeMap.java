package com.victor.utilities.DataStructures.Map.TreeMap;

import java.util.TreeMap;

public class ExampleOfTreeMap {
    public static void main(String[] args){
        TreeMap<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo1");    //  Duplicate key
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);


    }
}
