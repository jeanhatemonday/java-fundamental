package net.hatemonday.javafundamental.javaclasses.javamodifiers.accessmodifiers.attributesmodifier.publicattribute;


public class Second {

    /*
    Modifier    Description
    public      The code is accessible for all classes
     */
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}
