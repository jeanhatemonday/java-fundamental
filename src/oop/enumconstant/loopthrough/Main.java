package oop.enumconstant.loopthrough;

public class Main {

    public static void main(String[] args) {
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }
}
