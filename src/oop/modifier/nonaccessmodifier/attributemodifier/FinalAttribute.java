package oop.modifier.nonaccessmodifier.attributemodifier;

public class FinalAttribute {

    /*
    If you don't want the ability to override existing attribute values,
    declare attributes as final:
     */
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        FinalAttribute myObj = new FinalAttribute();
        myObj.x = 50;
        myObj.PI = 25;
        System.out.println(myObj.x);
    }
}
