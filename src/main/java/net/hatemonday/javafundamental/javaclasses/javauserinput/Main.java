package net.hatemonday.javafundamental.javaclasses.javauserinput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Method              Description
        nextBoolean()       Reads a boolean value from the user
        nextByte()          Reads a byte value from the user
        nextDouble()        Reads a double value from the user
        nextFloat()         Reads a float value from the user
        nextInt()           Reads a int value from the user
        nextLine()          Reads a String value from the user
        nextLong()          Reads a long value from the user
        nextShort()         Reads a short value from the user
         */
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        String name = myObj.nextLine();

        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
