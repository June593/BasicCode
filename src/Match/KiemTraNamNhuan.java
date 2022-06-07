package Match;

import java.util.Scanner;

//Ở đây chúng ta sẽ viết một chương trình java để kiểm tra xem năm người dùng nhập vào có phải là năm nhuận hay không.
// Trước khi xem chương trình, hãy xem cách xác định một năm có phải là năm nhuận hay không.
//
//        Năm nhuận là năm chia hết cho 400.
//        Năm nhuận là năm chia hết cho 4 nhưng không chia hết cho 100.
public class KiemTraNamNhuan {


    public static boolean checkYear(int n) {
        return (n % 400 == 0) || (n % 4 == 0 && n % 100 != 0);

    }

    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào năm bạn cần kiểm tra:");
        year = scan.nextInt();
        scan.close();


        if (checkYear(year)) {
            System.out.println("This is leap year");
        } else {
            System.out.println("This is not leap year");
        }

    }

}

