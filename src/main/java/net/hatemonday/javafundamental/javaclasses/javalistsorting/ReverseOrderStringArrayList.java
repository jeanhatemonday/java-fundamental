package net.hatemonday.javafundamental.javaclasses.javalistsorting;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrderStringArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars, Collections.reverseOrder());

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
