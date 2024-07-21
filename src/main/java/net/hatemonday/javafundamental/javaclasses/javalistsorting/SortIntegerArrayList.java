package net.hatemonday.javafundamental.javaclasses.javalistsorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);

        for (Integer i : myNumbers) {
            System.out.println(i);
        }
    }
}
