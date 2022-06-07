package Number;

import java.util.Scanner;

public class DaoNguocSo {
    static int result;

    static void DNS(int a) {
        int number;
        while (a != 0) {
            number = a % 10;
            result = result * 10 + number;
            a = a / 10;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = scan.nextInt();

        DNS(a);


    }
}