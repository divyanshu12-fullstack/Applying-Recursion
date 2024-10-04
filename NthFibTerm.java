package Recursion;

public class NthFibTerm {
    public static int NthTerm(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int secondLastTerm = NthTerm(n - 2);
        int previousTerm = NthTerm(n - 1);

        int current_term = secondLastTerm + previousTerm;
        return current_term;
    }

    public static int isSorted(int[] arr, int size) {
        int value = 0;
        if (arr[size - 1] >= isSorted(arr, size - 1)) {
            value = 1;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(NthTerm(6));
    }
}
