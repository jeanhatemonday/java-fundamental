package net.hatemonday.javafundamental.javaclasses.javaarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
