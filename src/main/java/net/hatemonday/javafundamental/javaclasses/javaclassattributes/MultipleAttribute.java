package net.hatemonday.javafundamental.javaclasses.javaclassattributes;

public class MultipleAttribute {

    String firstName = "John";
    String lastName = "Doe";
    int age = 24;

    public static void main(String[] args) {
        MultipleAttribute myObj = new MultipleAttribute();
        System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Age: " + myObj.age);
    }
}
