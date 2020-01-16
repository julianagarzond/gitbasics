import java.util.*;


public class Anagram {
    String word1;
    char[] arWord1;
    String word2;
    char[] arWord2;
    static String answer;

    public void prepareElements(){
        Scanner scanner = new Scanner(System.in);

        word1 = scanner.next().toLowerCase();
        arWord1 = word1.toCharArray();
        Arrays.sort(arWord1);
        word2 = scanner.next().toLowerCase();
        arWord2 = word2.toCharArray();
        Arrays.sort(arWord2);
        isAnagram();
    }

    public void isAnagram(){
        if (Arrays.equals(arWord1,arWord2)) {
            answer = "Anagrams";
        }else{
            answer = "Not Anagrams";
        }
    }

    public static void main(String[] args){
        Anagram anagram = new Anagram();
        anagram.prepareElements();
        System.out.println(answer);
    }

}
