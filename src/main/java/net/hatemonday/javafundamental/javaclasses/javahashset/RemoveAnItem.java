package net.hatemonday.javafundamental.javaclasses.javahashset;

import java.util.HashSet;

public class RemoveAnItem {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.remove("Volvo");
        System.out.println(cars);
    }
}
