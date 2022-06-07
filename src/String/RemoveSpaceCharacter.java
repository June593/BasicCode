package String;

public class RemoveSpaceCharacter {

    public static void main(String[] args) {
        String sentence = "Con Tim Mong Manh";
        
        sentence = sentence.replaceAll(" ","");
        System.out.println(sentence);

    }
}
