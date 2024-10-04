package Recursion;

public class BasicRecursion {
    public static void main(String[] args) {
        int x = 10;
        PrintDecreasing(x);
        System.out.println("*************");
        PrintIncreasing(20);
    }

    // Working before stack build up, when function is pushed in
    public static void PrintDecreasing(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        PrintDecreasing(n - 1);
    }

    // Working After stack build up, when function popped out
    public static void PrintIncreasing(int n) {
        if (n < 0) {
            return;
        }
        PrintIncreasing(n - 1);
        System.out.print(n + "\t");
    }
}
