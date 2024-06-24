package net.hatemonday.javafundamental.javaclasses.javaclassattributes;

public class ModifyAttribute {

    int x;
    int y = 10;

    public static void main(String[] args) {
        ModifyAttribute myObj = new ModifyAttribute();
        myObj.x = 40;
        System.out.println(myObj.x);

        myObj.y = 25;
        System.out.println(myObj.y);
    }
}
