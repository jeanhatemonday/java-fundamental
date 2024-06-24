package net.hatemonday.javafundamental.javaclasses.javaclassesandobjects;

public class MultipleObject {

    int x = 5;

    public static void main(String[] args) {
        MultipleObject myObj1 = new MultipleObject();
        System.out.println(myObj1.x);

        MultipleObject myObj2 = new MultipleObject();
        System.out.println(myObj2.x);
    }
}
