package net.hatemonday.javafundamental.javaclasses.javalinkedlist;

import java.util.LinkedList;

public class RemoveFirstMethod {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.removeFirst();
        System.out.println(cars);
    }
}
