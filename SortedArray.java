package Recursion;

public class SortedArray {
    public static boolean isArraySorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        } else {
            boolean answer_rest = isArraySorted(arr, index + 1);
            return answer_rest;
        }
    }

    public static void main(String[] args) {
        int[] A = { 3, 8, 6, 1, 9, 7 };
        int[] B = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isArraySorted(A, 0));
        System.out.println(isArraySorted(B, 0));
    }
}