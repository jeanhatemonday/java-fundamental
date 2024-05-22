package oop.modifier.accessmodifier.attributemodifier;

public class PublicAttribute {

    /*
    Modifier	Description
    public	    The code is accessible for all classes
     */
    public String firstName = "John";
    public String lastName = "Doe";
    public String email = "john@doe.com";
    public int age = 24;

    public static void main(String[] args) {
        PublicAttribute myObj = new PublicAttribute();
        System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}
