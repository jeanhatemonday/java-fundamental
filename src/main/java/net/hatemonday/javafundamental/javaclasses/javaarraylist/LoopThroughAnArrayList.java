package net.hatemonday.javafundamental.javaclasses.javaarraylist;

import java.util.ArrayList;

public class LoopThroughAnArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Loop through the elements of an ArrayList with a for loop
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // Loop through an ArrayList with the for-each loop
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
