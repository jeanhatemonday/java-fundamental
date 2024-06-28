package net.hatemonday.javafundamental.javaclasses.javaconstructors;

public class Example {

    int x;

    public Example() {
        x = 5;
    }

    public static void main(String[] args) {
        Example myObj = new Example();
        System.out.println(myObj.x);
    }
}
