package Recursion;

public class Factorial {
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        int factorial = n * fact(n - 1);
        return factorial;
    }

    public static int RaiseToPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int previous = RaiseToPower(x, n - 1);
        int value = x * previous;
        return value;
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.print("The factorial is: ");
        System.out.println(fact(x));
        System.out.println("Power value: " + RaiseToPower(4, 2));
    }
}
