package Recursion;

public class Pattern {
    public static void pattern(int size, int Initialrow, int Intialcol) {
        if (Initialrow > size) {
            return;
        }
        if (Intialcol <= Initialrow) {
            System.out.print("*");
            pattern(size, Initialrow, Intialcol + 1);
        } else {
            System.out.println();
            pattern(size, Initialrow + 1, 1);
        }
    }

    public static void main(String[] args) {
        pattern(7, 1, 1);
    }
}
