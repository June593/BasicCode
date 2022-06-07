///**
// * Thuat toan noi bot
// * Dua lan luot phan tu co gia tri lon nhat ( nho nhat ) ve vi tri cuoi cung hoac dau tien
// * VD
// */
//
//
//public class BubbleSortAlgorithm {
//    public static void main(String[] args) {
//        int[] mang = {5, 6, 4, 9, 8};
//
//
////        for (int j = 0; j < mang.length - 1; j++) {
////            for (int i = 0; i < mang.length - 1; i++) {
////                if (mang[i] > mang[i + 1]) {
////                    int temp = mang[i + 1];
////                    mang[i + 1] = mang[i];
////                    mang[i] = temp;
////                }
////            }
////        }
///** Dua be nhat len dau
// *
// */
//        for (int j = 0; j < mang.length - 1; j++) {
//            for (int i = mang.length - 1; i > 0; i--) {
//                if (mang[i] < mang[i - 1]) {
//                    int temp = mang[i - 1];
//                    mang[i - 1] = mang[i];
//                    mang[i] = temp;
//                }
//            }
//        }
//
//        for (int i : mang) {
//            System.out.print(i + " ");
//        }
//    }
//
//
//}


public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] mang = {2, 4, 5, 3, 1};

        for (int i = 0; i < mang.length - 1; i++) {
            for (int j = 0; j < mang.length - 1 - i; j++) {
                if (mang[j] > mang[j + 1]) {
//                    int temp = mang[j + 1];
//                    mang[j + 1] = mang[j];
//                    mang[j] = temp;

                    int temp = mang[j];
                    mang[j] = mang[j+1];
                    mang[j+1] = temp;
                }
            }
        }

        for (int i : mang) {
            System.out.println(i);
        }

    }


}