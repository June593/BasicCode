public class QuickSort {

    // Hàm nhận phần tử dau tien làm chốt,
    // đặt các phần tử nhỏ hơn chốt ở trước
    // và lớn hơn ở sau nó
    static int findPartition(int array[], int low, int high) {
        int pivot = low;
        int j =  high + 1;
        for (int i = high; i > low; i--) {
            if (array[pivot] <= array[i]) {
                j--;
                //swap
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }



        int temp = array[pivot];
        array[pivot] = array[j - 1];
        array[j - 1] = temp;
        System.out.println(j-1);
        return j - 1;


    }


    static void sort(int array[], int low, int high) {
        if (low < high) {

            int partition = findPartition(array, low, high);

            sort(array, low, partition - 1);
            sort(array, partition + 1, high);

        }


    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
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





