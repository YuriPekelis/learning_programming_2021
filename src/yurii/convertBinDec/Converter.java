package yurii.convertBinDec;

public class Converter {
    private int dec;
    private String bin;

    Converter() {
    }

    Converter(int dec) {
        this.dec = dec;
    }

    Converter(String binNumber) {
        this.bin = binNumber;
    }

    public void setDec(int dec) {
        this.dec = dec;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String convertToBin() {
        int maxPow = (int)(Math.log(this.dec) / Math.log(2));
        char[] resultChars = new char[maxPow + 1];
        String resultBinary;
        int leftValue = this.dec;

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

    public int convertToInt() {
        int resultDec = 0;
        for(int i=0; i<this.bin.length(); i++) {
            int currValue = Integer.parseInt(String.valueOf(this.bin.charAt(i)));
            int currentAddition= currValue * (int)Math.pow(2, this.bin.length() - 1 - i);
            resultDec += currentAddition;
        }
        return resultDec;
    }

    public int convertToIntAndPlus() {
        return this.convertToInt() + this.dec;
    }


}
