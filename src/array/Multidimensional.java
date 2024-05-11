package array;

public class Multidimensional {

    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[1][2]);

        // For Loop
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // For Each Loop
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }

        // Change Element Values
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);
    }
}
