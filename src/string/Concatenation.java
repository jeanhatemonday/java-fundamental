package string;

public class Concatenation {

    public static void main(String[] args) {
        String firstName1 = "John";
        String lastName1 = "Doe";
        System.out.println(firstName1 + " " + lastName1);

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }
}
