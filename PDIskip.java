package Recursion;

public class PDIskip {
    public static void RecursiveCall(int x) {
        if (x == 0) {
            return;
        }
        System.out.println(x);
        RecursiveCall(x - 1);
        System.out.println(x);
    }

    public static void PDISkip(int n) {
        if (n <= 0) {
            return;
        }
        if (n % 2 == 1) {
            System.out.println(n);
        }
        PDISkip(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        RecursiveCall(5);
        System.out.println("**************************");
        PDISkip(5);
    }
}
