package net.hatemonday.javafundamental.javaclasses.javalinkedlist;

import java.util.LinkedList;

public class RemoveLastMethod {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.removeLast();
        System.out.println(cars);
    }
}
