package victor.cardValidator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Validator {
    private static final Map <String, int[]> cardLengths = new HashMap<String, int[]>() {{
        put("MC", new int[]{16});
        put("AE", new int[]{15});
        put("Visa", new int[]{13, 16});
    }};

    /* All American Express numbers start with 34 or 37; most MasterCard numbers start with 51, 52, 53, 54, or 55
    (they also have some other potential starting numbers which we won’t concern ourselves with for this problem);
    and all Visa numbers start with 4
    */
    private static final Map<String, String[]> cardStartNumber = new HashMap<String, String[]>(){{
        put("MC", new String[]{"51","52","53","54","55"});
        put("AE", new String[]{"34","37"});
        put("Visa", new String[]{"4"});
    }};

    public static boolean isCardValid (String type, String cardNumber ){
        boolean isCardValid = false;
        for (int currentCardLength: cardLengths.get(type)) {
            if (cardNumber.length() == currentCardLength) {
                isCardValid = true;
                break;
            }
        }
        if (!isCardValid) return false;
        isCardValid = false;
        for (String cardStartWith: cardStartNumber.get(type)) {
            if (cardNumber.startsWith(cardStartWith)){
                isCardValid = true;
                break;
            }
        }
        if (!isCardValid) return false;
        int cardSum = 0;
//        1•2 + 0•2 + 0•2 + 0•2 + 0•2 + 6•2 + 0•2 + 4•2
//        13 + 4 + 0 + 0 + 0 + 0 + 0 + 3 + 0 = 20
        for (int i = cardNumber.length()-1; i >= 0; i--) {
           int currentDigit = Integer.parseInt(cardNumber.substring(i, i+1));
           if ((cardNumber.length() - i) % 2 == 0) {
               // 12
               String sumString = String.valueOf(currentDigit * 2);
               for(int j=0; j < sumString.length(); j++) {
                   cardSum = cardSum + Integer.parseInt(sumString.substring(j, j+1));
               }
//               cardSum += currentDigit * 2;
           } else {
               cardSum += currentDigit;
           }
        }

        return cardSum % 10 == 0;
    }

    public static Set<String> getCardTypes() {
        return cardStartNumber.keySet();
    }
}
