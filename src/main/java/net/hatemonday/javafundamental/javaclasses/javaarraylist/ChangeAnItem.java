package net.hatemonday.javafundamental.javaclasses.javaarraylist;

import java.util.ArrayList;

public class ChangeAnItem {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0, "Opel");
        System.out.println(cars);
    }
}
