package parameter;

public class MultipleParameters {

    static void myMethod(String firstName, int age) {
        System.out.println(firstName + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}
