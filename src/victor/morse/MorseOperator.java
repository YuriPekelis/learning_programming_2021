package victor.morse;

import java.util.HashMap;
import java.util.Map;

public class MorseOperator {
    private final static Map<String, String> abc = new HashMap() {{
        put("a", ".-");
        put("b", "-...");
        put("c", "-.-.");
    }};
//    char letterArray[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
//            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
//            'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
//            'y', 'z', '1', '2', '3', '4', '5', '6',
//            '7', '8', '9', '0'
//    };
//
//
//    string morseArray[] = {".-", "-...", "-.-.", "-..", ".", "..-.",
//            "--.", "....", "..", ".---", "-.-", ".-..",
//            "--", "-.", "---", ".--.", "--.-", ".-.",
//            "...", "-", "..-", "...-", ".--", "-..-",
//            "-.--", "--..", ".----", "..---", "...--",
//            "....-", ".....", "-....", "--...",
//            "---..", "----.", "-----"
//    };
    public static String code (String word ){
        // "abbb" ".- -... -... -..."
        // result="" symbol=a ---> "" + "a" + " "
        String result = "";
        for (String symbol: word.split("")) {
            if (!abc.containsKey(symbol)) {
                throw new IllegalArgumentException("Entered word  has illegal symbols");
            }
            result = result + abc.get(symbol) + ' ';

        }
        return result;
    }
    public static String decode (String codedWord){

        return "";
    }
}
