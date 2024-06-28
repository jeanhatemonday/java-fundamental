package net.hatemonday.javafundamental.javaclasses.javamodifiers.accessmodifiers.attributesmodifier;

public class DefaultAttribute {

    /*
    Modifier    Description
    default     The code is only accessible in the same package. This is used when you don't specify a modifier.
     */
    String firstName = "John";
    String lastName = "Doe";
    String email = "john@doe.com";
    int age = 24;

    public static void main(String[] args) {
        DefaultAttribute myObj = new DefaultAttribute();
        System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}
