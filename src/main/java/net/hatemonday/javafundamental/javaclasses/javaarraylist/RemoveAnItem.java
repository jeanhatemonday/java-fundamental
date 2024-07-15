package net.hatemonday.javafundamental.javaclasses.javaarraylist;

import java.util.ArrayList;

public class RemoveAnItem {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(0);
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);
    }
}
