package Sorts;

/**
 * 4 3 2 5 1
 * 3 4 2 5 1
 * 2 3 4 5 1
 * 2 3 4 5 1
 * 1 2 3 4 5
 */

public class InsertionSort {
    static void sort(int arr[], int low, int high) {

        for (int i = 1; i <= high; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }


    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {


        int arr[] = {4, 3, 2, 5, 1};
        int n = arr.length;

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        //     System.out.println(partition(arr, 0, n-1));
        sort(arr, 0, n - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}

