package string;

public class Method {

    public static void main(String[] args) {
        String txt = "Hello World";

        // String Length
        System.out.println("The length of the txt string is: " + txt.length());

        // Converts all the characters in this String to upper case
        System.out.println(txt.toUpperCase());

        // Converts all the characters in this String to lower case
        System.out.println(txt.toLowerCase());

        // Index within this string of the first occurrence of the specified substring
        System.out.println(txt.indexOf("World"));
    }
}
