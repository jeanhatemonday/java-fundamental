package net.hatemonday.javafundamental.javatutorial.javadatatypes;

public class PrimitiveData {

    public static void main(String[] args) {
        /*
        Data Type       Size        Description
        byte            1 byte	    Stores whole numbers from -128 to 127
        short	        2 bytes	    Stores whole numbers from -32,768 to 32,767
        int	            4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	        8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	        4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	        8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	        1 bit	    Stores true or false values
        char	        2 bytes	    Stores a single character/letter or ASCII values
         */
        byte myByte = 100;
        System.out.println(myByte);

        short myShort = 5000;
        System.out.println(myShort);

        int myInt = 100000;
        System.out.println(myInt);

        long myLong = 15000000000L;
        System.out.println(myLong);

        float myFloat = 5.75f;
        System.out.println(myFloat);

        double myDouble = 19.99d;
        System.out.println(myDouble);

        boolean isJavaFun = true;
        System.out.println(isJavaFun);

        char myGrade = 'A';
        System.out.println(myGrade);
    }
}
