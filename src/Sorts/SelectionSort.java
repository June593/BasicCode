package Sorts;

/**
 * Để bạn dần hiểu rõ hơn về thuật toán Selection Sort, hãy xem giải thuật của nó:
 * <p>
 * Bước 1: Chọn phần tử có khóa nhỏ nhất trong n phần tử từ a[0] đến a[n-1] và hoán vị nó với phần tử a[0].
 * Bước 2: Chọn phần tử có khóa nhỏ nhất trong n – 1 phần tử từ a[1] đến a[n-1] và hoán vị nó với a[1].
 * Tổng quát ở bước thứ i chọn phần tử có khóa nhỏ nhất trong n – i phần tử từ a[i] đến a[n-1] và hoán vị nó với a[i].
 */
public class SelectionSort {

    static void sort(int arr[], int low, int high) {
        int index_min = 0;

        for (int i = 0; i <= high - 1; i++) {

            for (int j = i; j <= high; j++) {
                if (arr[j] < arr[i]) {
                    index_min = j;

                }

            }
            System.out.println(index_min);
            int temp = arr[i];
            arr[i] = arr[index_min];
            arr[index_min] = temp;


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
