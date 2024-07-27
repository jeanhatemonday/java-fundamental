package net.hatemonday.javafundamental.javaclasses.javahashset;

import java.util.HashSet;

public class LoopThroughAHashSet {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
