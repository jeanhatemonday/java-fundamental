package net.hatemonday.javafundamental.javaclasses.javamodifiers.nonaccessmodifiers.methodsmodifier;

public class StaticMethod {

    /*
    Modifier    Description
    static      Methods belongs to the class, rather than an object
     */
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();
    }
}
