package net.hatemonday.javafundamental.javamethods.javascope;

public class Block {

    public static void main(String[] args) {
        // Code here cannot use x

        { // This is a block

            // Code here cannot use x
            int x = 100;

            // Code here can use x
            System.out.println(x);

        } // The block ends here

        // Code here cannot use x
    }
}
