package victor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Write a function that returns the first n vowels of a string.
//
//Examples
//firstNVowels("sharpening skills", 3) ➞ "aei"
//
//firstNVowels("major league", 5) ➞ "aoeau"
//
//firstNVowels("hostess", 5) ➞ "invalid"
//Notes
//Return "invalid" if the n exceeds the number of vowels in a string.
//Vowels are: a, e, i, o, u
public class VowelsQty {
    public static void main(String[] args) {
        System.out.println("enter your string");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("enter Qty");
        int vowelsQty = scanner.nextInt();
        Character[] vow = {'a','e','u','i','o'};
        List<Character> vowels = Arrays.asList(vow);
        List<Character> foundVowels= new ArrayList<>();
                for (char ch : word.toCharArray()){
           if (vowels.contains(ch)) ;
        }
    }
}
