package net.hatemonday.javafundamental.javaclasses.javaconstructors;

public class SingleParameter {

    int x;

    public SingleParameter(int y) {
        x = y;
    }

    public static void main(String[] args) {
        SingleParameter myObj = new SingleParameter(5);
        System.out.println(myObj.x);
    }
}
