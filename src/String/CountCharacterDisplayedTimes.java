package String;

import java.util.Scanner;

public class CountCharacterDisplayedTimes {
    static void count(String text) {
        int nguyenAm = 0;
        int phuAm = 0;
      //  text = text.toLowerCase();

        for (int i = 1; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e' || ch == 'u') {
                nguyenAm = nguyenAm + 1;
            } else if (ch >= 'a' && ch <= 'z') {
                phuAm++;
            }
        }

        System.out.println("nguyen am: " + nguyenAm);
        System.out.println("phu am:" + phuAm);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap text: ");
        String text = scan.nextLine();

        count(text);


    }

}
