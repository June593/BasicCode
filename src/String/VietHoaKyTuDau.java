package String;


import java.util.Scanner;

public class VietHoaKyTuDau {
    public static void main(String[] args) {

        System.out.print("Enter a text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        boolean foundSpace = true;

        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length - 1; i++) {
            if (Character.isLetter(textArray[i])) {
                if (foundSpace) {
                    textArray[i] = Character.toUpperCase(textArray[i]);
                    foundSpace = false;
                }
            } else foundSpace = true;
        }
        System.out.printf(String.valueOf(textArray));


    }
}



