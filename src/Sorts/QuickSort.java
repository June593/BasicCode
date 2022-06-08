package Sorts;

public class QuickSort {

    static int findPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int j = (low - 1);
        for (int i = low; i < high; i++) {
            if (pivot > arr[i]) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[j + 1];
        arr[j + 1] = arr[high];
        arr[high] = temp;
        return j + 1;
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = findPartition(arr, low, high);

            quicksort(arr, low, partition - 1);
            quicksort(arr, partition + 1, high);
        }
    }

    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] array = {4, 3, 2, 5, 1};
        int n = array.length;
        System.out.println("Mang chua sap xep: ");
        printArray(array);
        quicksort(array, 0, n - 1);
        System.out.println("Mang da sap xep: ");
        printArray(array);
    }
}
