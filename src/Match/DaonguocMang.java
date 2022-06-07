package Match;

import java.util.Scanner;

public class DaonguocMang {

    public static void main(String args[]) {
        int counter;
        int number[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử trong mảng: ");
        counter = scanner.nextInt();
        for (int i = 0; i < counter; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            number[i] = scanner.nextInt(); }

            for (int i = 0; i < number.length - 1; i++) {

                if (i < counter - 1 - i) {
                    int temp = number[i];
                    number[i] = number[counter - 1 -i];
                    number[counter - 1 -i] = temp;
                }

//0123
            }



        System.out.print("Mảng sau khi đảo ngược: ");
        for (int i = 0; i < counter; i++) {
            System.out.print(number[i] + "  ");
        }
    }
}
