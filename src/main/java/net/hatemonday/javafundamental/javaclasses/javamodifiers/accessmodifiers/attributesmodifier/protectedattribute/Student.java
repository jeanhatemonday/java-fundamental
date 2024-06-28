package net.hatemonday.javafundamental.javaclasses.javamodifiers.accessmodifiers.attributesmodifier.protectedattribute;

public class Student extends Person {

    private int graduationYear = 2018;

    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}
