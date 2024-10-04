package Recursion;

public class BubbleSort {

    public static void SwapIndex(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // si -> Starting Index
    // li -> Last Index
    public static void bubbleSort(int[] arr, int si, int li) {
        if (li == 0) {
            return;
        }
        if (si < li) {
            if (arr[si] > arr[si + 1]) {
                SwapIndex(arr, si, si + 1);

            }
            bubbleSort(arr, si + 1, li);
        }
        // Executed when si == li
        bubbleSort(arr, 0, li - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 50, 40, 30, 20, 10 };
        bubbleSort(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }
}
