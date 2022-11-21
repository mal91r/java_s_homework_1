import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Character> list = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int consonants = 0, vowels = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                if(list.contains(str.charAt(i))){
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.printf("Consonants: %d%nVowels: %d%n", consonants, vowels);
    }
}