package net.hatemonday.javafundamental.javamethods.javamethods;

public class CallMethod {

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
}
