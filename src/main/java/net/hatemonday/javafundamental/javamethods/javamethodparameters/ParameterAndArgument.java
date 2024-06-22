package net.hatemonday.javafundamental.javamethods.javamethodparameters;

public class ParameterAndArgument {

    static void myMethod(String firstName) {
        System.out.println(firstName + " Refsnes");
    }

    public static void main(String[] args) {
        /*
        When a parameter is passed to the method,
        it is called an argument.
        So, from the example above: firstName is a parameter,
        while Liam, Jenny and Anja are arguments.
         */
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}
