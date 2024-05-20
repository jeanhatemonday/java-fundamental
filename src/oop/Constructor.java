package oop;

public class Constructor {

    int modelYear;
    String modelName;

    public Constructor(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        Constructor myCar = new Constructor(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
