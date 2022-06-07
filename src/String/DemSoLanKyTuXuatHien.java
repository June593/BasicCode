package String;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DemSoLanKyTuXuatHien {

    static void count(String text) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            } else map.put(text.charAt(i), 1);
        }

        Set<Character> keySet = map.keySet();
        for (Character ch : keySet) {
            System.out.println("So lan xuat hien của:" + ch + ":" + map.get(ch));
        }
    }

    static void count1(String text) {
        int[] array = new int[256];
        //dem so ky tu khac nhau
        for (int i = 0; i < text.length(); i++) {
            array[text.charAt(i)]++;
         }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
            {
                System.out.println((char) i + ": " + array[i]);
            }
                }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap text: ");
        String text = scan.nextLine();

        count1(text);


    }

}
