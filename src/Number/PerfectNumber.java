package Number;

import java.util.Scanner;

public class PerfectNumber {
    static void checkNumber(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }

        }
        if (sum == a) {
            System.out.println("This is a perfect number");

        } else System.out.println("This is not a perfect number");

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = scan.nextInt();

        checkNumber(a);


    }


}
