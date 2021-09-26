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
        System.out.println("Enter your string, please: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Enter expected letters: ");
        int vowelsQty = scanner.nextInt();
        Character[] vow = {'a','e','u','i','o'};
        List<Character> vowels = Arrays.asList(vow);
        List<Character> foundVowels= new ArrayList<>();
        int counter = 0;
        for (char ch : word.toCharArray()){
           if ((vowels.contains(ch)) && (counter < vowelsQty)) {
               foundVowels.add(counter, ch);
               counter++;
           }
        }
        if (counter >= vowelsQty){
            System.out.println("Founded vowels are: " + foundVowels);
        } else {
            System.out.println("INVALID");
        }
    }
}
