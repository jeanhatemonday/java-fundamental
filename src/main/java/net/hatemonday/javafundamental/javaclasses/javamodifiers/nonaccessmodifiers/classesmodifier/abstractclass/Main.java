package net.hatemonday.javafundamental.javaclasses.javamodifiers.nonaccessmodifiers.classesmodifier.abstractclass;

public class Main {

    /*
    Modifier    Description
    abstract    The class cannot be used to create objects.
                To access an abstract class, it must be inherited from another class.
     */
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();
    }
}
