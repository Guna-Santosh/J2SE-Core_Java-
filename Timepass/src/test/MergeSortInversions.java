package test;
import java.util.Arrays;

public class MergeSortInversions {
    // Function to count inversions and sort the array using MergeSort
    public static int mergeSortWithInversions(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            int leftInversions = mergeSortWithInversions(arr, left, mid);
            int rightInversions = mergeSortWithInversions(arr, mid + 1, right);
            int mergeInversions = merge(arr, left, mid, right);
            
            return leftInversions + rightInversions + mergeInversions;
        }
        return 0; // Base case: No inversions for a single element or empty array
    }

    // Function to merge two sorted subarrays and count inversions
    public static int merge(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] leftArr = new String[n1];
        String[] rightArr = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int inversions = 0;
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                // Increment the inversion count
                inversions += n1 - i;
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }

        return inversions;
    }

    public static void main(String[] args) {
        String[] inputArray = {"E", "X", "A", "M", "P", "L", "E"};
        int inversions = mergeSortWithInversions(inputArray, 0, inputArray.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(inputArray));
        System.out.println("Number of Inversions: " + inversions);
    }
}
