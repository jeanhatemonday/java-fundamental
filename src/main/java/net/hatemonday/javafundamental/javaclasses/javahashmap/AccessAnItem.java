package net.hatemonday.javafundamental.javaclasses.javahashmap;

import java.util.HashMap;

public class AccessAnItem {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.get("England"));
    }
}
