package array;

public class Element {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        // Change an Array Element
        cars[0] = "Opel";
        System.out.println(cars[0]);

        // Array Length
        System.out.println(cars.length);
    }
}
