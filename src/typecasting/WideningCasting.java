package typecasting;

public class WideningCasting {

    public static void main(String[] args) {
        /*
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
         */
        int myInt = 9;
        System.out.println(myInt);

        // Automatic casting: int to double
        System.out.println((double) myInt);
    }
}
