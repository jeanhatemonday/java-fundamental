package net.hatemonday.javafundamental.javaclasses.javaconstructors;

public class MultipleParameter {

    int modelYear;
    String modelName;

    public MultipleParameter(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        MultipleParameter myCar = new MultipleParameter(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
