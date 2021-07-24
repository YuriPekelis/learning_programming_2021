package victor.morse;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MorseOperator {
    private final static Map<String, String> abc = new MyMap<String, String>() {{
        put("a", ".-");
        put("b", "-...");
        put("c", "-.-.");
        put("d", "-..");
        put("e", "..-.");
        put("f", "--.");
        put("g", "....");
        put("h", "..");
        put("i", ".---");
        put("j", "-.-");
        put("k", ".-..");
        put("l", "--");
        put("m", "-.");
        put("n", "---");
        put("o", ".--.");
        put("p", "--.-");
        put("q", ".-.");
        put("r", "...");
        put("s", "-");
        put("t", "..-");
        put("u", "...-");
        put("v", ".--");
        put("w", "-..-");
        put("x", "-.--");
        put("y", "--..");
        put("z", ".----");
    }};

    public static String code (String word){
        // "abbb" ".- -... -... -..."
        // result="" symbol=a ---> "" + "a" + " "
        StringBuilder result = new StringBuilder("");
//        String result = "";
        for (String symbol: word.split("")) {
            if (!abc.containsKey(symbol)) {
                throw new IllegalArgumentException("Entered word  has illegal symbols" + symbol);
            }
            result.append(abc.get(symbol));
            result.append(" ");

        }
        return result.toString();
    }
    public static String decode (String codedWord){
        StringBuilder result = new StringBuilder("");
//        String result = "";
        for (String symbol: codedWord.split(" ")) {
            if (!abc.containsValue(symbol)) {
                throw new IllegalArgumentException("No such combination in ABC " + symbol);
            }
            for (Entry<String, String> entry : abc.entrySet()) {
                if (entry.getValue().equals(symbol)) {
                    result.append(entry.getKey());
                    break;
                }
            }
        }
        return result.toString();
    }
}
