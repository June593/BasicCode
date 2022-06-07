///**
// * Them 1 phan tu moi vao, sort lại, tối ưu
// * Lấy 1 phần tử bắt đầu từ thứ 2 đi so sánh với mảng đã cho trước
// */
//
//
//public class InsertionSort {
//    public static void main(String[] args) {
//        int[] array = {5, 6, 4, 9, 8};
//        int n = array.length;
//
//        for (int i = 1; i < n; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                if (array[i] < array[j]) {
//                    int temp = array[j];
//                    array[j] = array[i];
//                    array[i] = temp;
//                    break;
//                }
//            }
//        }
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//    }
//
//
//}
//


/**
 * Insertion Sort
 */

public class InsertionSort {
    public static void insertSortAndPrintArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];

            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;

            }
            array[j + 1] = key;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 5, 3, 1};
        insertSortAndPrintArray(array);

        int a = 7;
        int b = a/2;
        System.out.println(b);
                 }

}