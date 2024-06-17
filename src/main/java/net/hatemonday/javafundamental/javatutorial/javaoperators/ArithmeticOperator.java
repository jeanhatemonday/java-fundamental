package net.hatemonday.javafundamental.javatutorial.javaoperators;

public class ArithmeticOperator {

    public static void main(String[] args) {
        /*
        Operator	Name	            Description                                 Example
        +	        Addition            Adds together two values                    x + y
        -	        Subtraction         Subtracts one value from another            x - y
        *	        Multiplication      Multiplies two values                       x * y
        /	        Division            Divides one value by another                x / y
        %	        Modulus             Returns the division remainder              x % y
        ++	        Increment           Increases the value of a variable by 1      ++x
        --	        Decrement           Decreases the value of a variable by 1      --x
         */
        int x = 5;
        int y = 3;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        ++x;
        System.out.println(x);

        --y;
        System.out.println(y);
    }
}
