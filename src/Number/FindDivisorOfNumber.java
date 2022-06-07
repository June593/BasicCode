package Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDivisorOfNumber {

    static void checkNumber(int a) {
        int[] divisors = new int[100];
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i + "");
                divisors[count] = i;
                count++;
            }
        }
        for (int x : divisors) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = scan.nextInt();
        checkNumber(a);
    }
}
