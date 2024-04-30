package typecasting;

public class NarrowingCasting {

    public static void main(String[] args) {
        /*
        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
         */
        double myDouble = 9.78d;
        System.out.println(myDouble);

        // Explicit casting: double to int
        int myInt = (int) myDouble;
        System.out.println(myInt);
    }
}
