package yurii.convertBinDec;

import java.util.Scanner;

public class ConverterHelperBinToDec {
    public static void main(String[] args) {
        System.out.println("Enter bin number:");
        Scanner scanner = new Scanner(System.in);
        String binNumber = scanner.next();
        Converter converter = new Converter(binNumber);
        System.out.println("Dec number normal: " + converter.convertToInt());
        System.out.println("Dec number static: " + ConverterStatic.convertToInt(binNumber));
        System.out.println("Dec number static one method: " + ConverterStatic.convert(binNumber));

        converter.setDec(56);
        int sum = converter.convertToIntAndPlus();
        System.out.println("Sum number static one method: " + sum);
    }
}
