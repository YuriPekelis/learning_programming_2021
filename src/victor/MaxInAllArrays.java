package victor;

import java.util.ArrayList;
import java.util.List;

public class MaxInAllArrays {
    public static void main(String[] args) {
        List<Integer> maxValues = new ArrayList<>();
        for (String str : args) {
            String[] splittedStr = str.split(",");
            int[] splittedInt = new int[splittedStr.length];
            for (int i = 0; i < splittedInt.length; i++) {
                splittedInt[i] = Integer.parseInt(splittedStr[i]);
            }
            int maximum = splittedInt[0];
            for (int i = 1; i < splittedInt.length; i++) {
                if (splittedInt[i] > maximum) {
                    maximum = splittedInt[i];
                }
            }
            maxValues.add(maximum);
            System.out.println("Result:" + maxValues);
        }
    }
}
