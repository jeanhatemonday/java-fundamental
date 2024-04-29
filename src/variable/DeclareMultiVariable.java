package variable;

public class DeclareMultiVariable {

    public static void main(String[] args) {

        // To declare more than one variable of the same type, use a comma-separated list:
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        // Assign the same value to multiple variables in one line:
        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);
    }
}
