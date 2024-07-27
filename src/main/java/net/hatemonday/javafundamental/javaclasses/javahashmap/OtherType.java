package net.hatemonday.javafundamental.javaclasses.javahashmap;

import java.util.HashMap;

public class OtherType {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }
    }
}
