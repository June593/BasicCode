package String;

import java.util.HashMap;
import java.util.Set;

public class FindCharacter {

    public static void find(String input) {
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //kiem tra so lan ky tu trung lap

        for (Character ch : inputArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else map.put(ch, 1);
        }
        Set<Character> test = map.keySet();
        for (Character key : test) {
//            if (map.get(key) > 1) {
                System.out.println("Ky tu" + key + "co so lan xuat hien" + map.get(key));
            }

    }

    public static void main(String[] args) {
        find("Hello World");
    }
}
