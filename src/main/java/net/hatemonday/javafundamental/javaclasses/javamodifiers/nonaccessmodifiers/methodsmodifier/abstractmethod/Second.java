package net.hatemonday.javafundamental.javaclasses.javamodifiers.nonaccessmodifiers.methodsmodifier.abstractmethod;

public class Second {

    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name: " + myObj.firstName);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();
    }
}
