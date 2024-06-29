package net.hatemonday.javafundamental.javaclasses.javamodifiers.nonaccessmodifiers.classesmodifier.finalclass;

public class Main extends Vehicle {

    /*
    Modifier    Description
    final       The class cannot be inherited by other classes
     */
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Main myFastCar = new Main();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}
