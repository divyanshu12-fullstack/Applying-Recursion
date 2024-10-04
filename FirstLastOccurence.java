package Recursion;

public class FirstLastOccurence {
    public static int FirstOccuredAt(int[] arr, int element, int index) {
        while (index <= arr.length - 1) {
            if (arr[index] == element) {
                return index;
            } else {
                return FirstOccuredAt(arr, element, index + 1);
            }
        }
        return -1;
    }

    public static int LastOccurenceAt(int[] arr, int element, int index) {
        if (index == arr.length) {
            // Will return to index, when it reaches end
            return -1;
        }
        int answer = LastOccurenceAt(arr, element, index + 1);
        if (answer == -1) {
            if (arr[index] == element) {
                // returning index value breaks the searching as index is returned to all
                // previous calls
                return index;
            }
            // Returns -1 forcing loop to search again
            return -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] A = { 6, 8, 1, 1, 8, 3, 4, 1 };
        System.out.println(FirstOccuredAt(A, 1, 0));
        System.out.println(LastOccurenceAt(A, 1, 0));
    }
}
