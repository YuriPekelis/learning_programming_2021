package mario;

import java.util.Scanner;

public class MarioHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        Mario mario = new Mario();
        mario.printPyramid(height);

    }
}
