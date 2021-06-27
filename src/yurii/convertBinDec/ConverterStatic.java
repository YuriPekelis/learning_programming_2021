package yurii.convertBinDec;

public class ConverterStatic {
    public static String convertToBin(int dec) {
        int maxPow = (int)(Math.log(dec) / Math.log(2));
        char[] resultChars = new char[maxPow + 1];
        String resultBinary;
        int leftValue = dec;

        for (int i = maxPow; i >= 0; i--) {
            int curr2Pow = (int)Math.pow(2, i);
            if(leftValue >= curr2Pow) {
                resultChars[maxPow - i] = '1';
//                leftValue = leftValue - curr2Pow; // the same as next line
                leftValue -= curr2Pow;
            } else {
                resultChars[maxPow - i] = '0';
            }
        }
        resultBinary = new String(resultChars);
        return resultBinary;
    }

    public static int convertToInt(String bin) {
        int resultDec = 0;
        for(int i=0; i<bin.length(); i++) {
            int currValue = Integer.parseInt(String.valueOf(bin.charAt(i)));
            int currentAddition= currValue * (int)Math.pow(2, bin.length() - 1 - i);
            resultDec += currentAddition;
        }
        return resultDec;
    }

    public static String convert(int dec) { // Polymorphism
        int maxPow = (int)(Math.log(dec) / Math.log(2));
        char[] resultChars = new char[maxPow + 1];
        String resultBinary;
        int leftValue = dec;

        for (int i = maxPow; i >= 0; i--) {
            int curr2Pow = (int)Math.pow(2, i);
            if(leftValue >= curr2Pow) {
                resultChars[maxPow - i] = '1';
//                leftValue = leftValue - curr2Pow; // the same as next line
                leftValue -= curr2Pow;
            } else {
                resultChars[maxPow - i] = '0';
            }
        }
        resultBinary = new String(resultChars);
        return resultBinary;
    }

    public static int convert(String bin) { // Polymorphism
        int resultDec = 0;
        for(int i=0; i<bin.length(); i++) {
            int currValue = Integer.parseInt(String.valueOf(bin.charAt(i)));
            int currentAddition= currValue * (int)Math.pow(2, bin.length() - 1 - i);
            resultDec += currentAddition;
        }
        return resultDec;
    }

}
