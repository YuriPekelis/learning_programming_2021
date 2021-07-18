package victor.morse;

import java.util.Scanner;

public class MorseRunner {
    public static void main(String[] args) {
        String result;
        System.out.println("Enter word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        boolean isForDecode = true;
        for (char ch : word.toCharArray()) {
            if ((ch!= ' ')&&(ch!='-')&&(ch!= '.')) {
                isForDecode = false;
                break;
            }
        }
        if (isForDecode) {
            result = MorseOperator.decode(word);
        } else {
            result = MorseOperator.code(word);
        }
        System.out.println("Result of operation: " + result);
    }
}
