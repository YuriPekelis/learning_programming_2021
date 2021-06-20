package yurii.convertBinDec;

import java.util.Scanner;

public class ConvertHelperDecToBin {
    public static void main(String[] args) {
        System.out.println("Enter dec number:");
        Scanner scanner = new Scanner(System.in);
        int dec = scanner.nextInt();
        Converter converter = new Converter(dec);
        System.out.println("Binary file normal: " + converter.convertToBin());
        System.out.println("Binary file static: " + ConverterStatic.convertToBin(dec));
        System.out.println("Binary file static one method: " + ConverterStatic.convert(dec));
    }
}
