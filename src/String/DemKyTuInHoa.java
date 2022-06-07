package String;

public class DemKyTuInHoa {

    public static void main(String[] args) {
        String text = "AbcdEF";
        int count = 0;


        char[] array = text.toCharArray();

        for ( int i = 0; i < array.length; i++) {
            if (array[i] == 'A') {
                array[i] = 'a';



            }

        }

        int[] ar = { 0 , 1};
        String te = String.copyValueOf(ar);
        System.out.println(ar);
        System.out.println(array);
        System.out.println(count);
    }
}
