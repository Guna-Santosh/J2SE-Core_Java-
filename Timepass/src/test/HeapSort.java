package test;
import java.util.ArrayList;

public class HeapSort {
    // Upheap Algorithm for constructing a binary heap
    public static void upheap(ArrayList<Integer> heap, int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap.get(index) > heap.get(parentIndex)) {
            // Swap the elements
            int temp = heap.get(index);
            heap.set(index, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            
            // Move up the tree
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    // Min Extraction Algorithm for sorting a heap
    public static ArrayList<Integer> heapSort(ArrayList<Integer> arr) {
        int n = arr.size();
        // Build the initial max-heap using Upheap Algorithm
        for (int i = 1; i < n; i++) {
            upheap(arr, i);
        }

        // Extract elements and build the sorted array
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            // Swap the root (max) with the last element
            int temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);
            
            // Add the max element to the sorted array
            sortedArray.add(temp);

            // Restore the heap property by down-heap
            int index = 0;
            while (true) {
                int leftChild = 2 * index + 1;
                int rightChild = 2 * index + 2;
                int largest = index;

                if (leftChild < i && arr.get(leftChild) > arr.get(largest)) {
                    largest = leftChild;
                }

                if (rightChild < i && arr.get(rightChild) > arr.get(largest)) {
                    largest = rightChild;
                }

                if (largest == index) {
                    break; // Heap property restored
                }

                // Swap the elements
                int swap = arr.get(index);
                arr.set(index, arr.get(largest));
                arr.set(largest, swap);

                index = largest;
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(8);
        inputList.add(6);
        inputList.add(5);
        inputList.add(3);
        inputList.add(7);
        inputList.add(4);

        System.out.println("Input List: " + inputList);
        ArrayList<Integer> sortedList = heapSort(inputList);
        System.out.println("Sorted List: " + sortedList);
    }
}
