package test;
import java.util.Arrays;

public class HeapCheck {
    // Function to check if an array represents a heap
    public static boolean isHeap(int[] arr) {
        int n = arr.length;
        
        // Start from the last non-leaf node and move towards the root
        for (int i = (n - 1) / 2; i >= 0; i--) {
            // Check if the current parent node violates the heap property
            if (!isHeapPropertySatisfied(arr, i, n)) {
                return false;
            }
        }
        
        return true;
    }
    
    // Helper function to check if the heap property is satisfied at a given node
    public static boolean isHeapPropertySatisfied(int[] arr, int parentIndex, int size) {
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        
        // Check if left child exists and is greater than the parent
        if (leftChildIndex < size && arr[leftChildIndex] > arr[parentIndex]) {
            return false;
        }
        
        // Check if right child exists and is greater than the parent
        if (rightChildIndex < size && arr[rightChildIndex] > arr[parentIndex]) {
            return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int[] inputArray = {1, 8, 6, 5, 3, 7, 4};

        System.out.println("Input Array: " + Arrays.toString(inputArray));
        
        if (isHeap(inputArray)) {
            System.out.println("The input array is a heap.");
        } else {
            System.out.println("The input array is not a heap.");
        }
    }
}
