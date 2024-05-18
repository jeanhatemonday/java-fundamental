package oop;

public class ClassAttribute {

    // Create three attributes: firstName, lastName, age
    String firstName = "John";
    String lastName = "Doe";
    int age = 24;

    public static void main(String[] args) {
        ClassAttribute myObj = new ClassAttribute();
        System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Age: " + myObj.age);
    }
}
