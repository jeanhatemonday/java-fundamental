package net.hatemonday.javafundamental.javatutorial.javastrings;

public class SpecialCharacter {

    public static void main(String[] args) {
        /*
        Escape character	Description
        \"	                Double quote
        \\	                Backslash
        \n	                New Line
        \r	                Carriage Return
        \t	                Tab
        \b	                Backspace
         */
        String txt1 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt1);

        String txt2 = "It's alright.";
        System.out.println(txt2);

        String txt3 = "The character \\ is called backslash.";
        System.out.println(txt3);

        String txt4 = "Hello\nWorld!";
        System.out.println(txt4);

        String txt5 = "Hello\rWorld!";
        System.out.println(txt5);

        String txt6 = "Hello\tWorld!";
        System.out.println(txt6);

        String txt7 = "Hel\blo World!";
        System.out.println(txt7);
    }
}
