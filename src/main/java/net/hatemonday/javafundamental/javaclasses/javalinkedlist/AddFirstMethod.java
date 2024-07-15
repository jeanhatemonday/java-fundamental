package net.hatemonday.javafundamental.javaclasses.javalinkedlist;

import java.util.LinkedList;

public class AddFirstMethod {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.addFirst("Mazda");
        System.out.println(cars);
    }
}
