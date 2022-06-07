package Number;

import java.util.Scanner;

public class LeastCommonMultiple {

    static void BCNN(int a, int b) {
        int i = 1;
        boolean found = false;
        while (!found) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("BCNN : " + i);
             break;
            }
            i++;
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = scan.nextInt();
        System.out.println("Nhap b");
        int b = scan.nextInt();

        BCNN(a, b);


    }
}
