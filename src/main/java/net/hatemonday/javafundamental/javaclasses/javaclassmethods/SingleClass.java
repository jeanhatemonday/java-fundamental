package net.hatemonday.javafundamental.javaclasses.javaclassmethods;

public class SingleClass {

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        SingleClass myCar = new SingleClass();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
