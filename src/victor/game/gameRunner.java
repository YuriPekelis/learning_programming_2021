package victor.game;

import andriy.library.LibraryOperator;

import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class gameRunner {
    public static void main(String[] args) {
        String[] options = {"Rock" , "Paper", "Scissors"};
        for (int i = 0; i < options.length; i++) {
            System.out.println(String.format("%s. %s", i, options[i]));
        }
        System.out.println("Input choice:");
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        try {
            userChoice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You haven't entered number.");
            throw e;
        }
        if ((userChoice>2)|| (userChoice<0)){
            System.out.println("Not valid number");
            System.exit(2);
        }

        Random random = new Random();
        int pcChoice=random.nextInt(2);
        System.out.println(String.format("PC value is %s", options[pcChoice]));
        // pc chose Rock
        if (userChoice == pcChoice) {
            System.out.println("Draw");
        } else if(userChoice == (pcChoice+1)%3) {
            System.out.println("user win");
        } else {
            System.out.println("pc win");
        }
//        } else {
//            switch (userChoice){
//                case (0):
//                    if (pcChoice == 2)
//                        System.out.print("User wins!");
//                    else
//                        System.out.print("PC wins!");
//                    break;
//                case (1):
//                    if (pcChoice == 0)
//                        System.out.print("User wins!");
//                    else
//                        System.out.print("PC wins!");
//                    break;
//                case (2):
//                    if (pcChoice == 1)
//                        System.out.print("User wins!");
//                    else
//                        System.out.print("PC wins!");
//                    break;
//                default:
//                    System.out.print("Not valid number");
//                    break;
//            }
    }
}