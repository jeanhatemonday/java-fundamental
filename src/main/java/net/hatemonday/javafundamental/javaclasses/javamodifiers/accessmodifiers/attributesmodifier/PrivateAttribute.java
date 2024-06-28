package net.hatemonday.javafundamental.javaclasses.javamodifiers.accessmodifiers.attributesmodifier;

public class PrivateAttribute {

    /*
    Modifier	Description
    private	    The code is only accessible within the declared class
     */
    private String firstName = "John";
    private String lastName = "Doe";
    private String email = "john@doe.com";
    private int age = 24;

    public static void main(String[] args) {
        PrivateAttribute myObj = new PrivateAttribute();
        System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}
