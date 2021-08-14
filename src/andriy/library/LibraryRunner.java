package andriy.library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {
        LibraryOperator library = new LibraryOperator("library.csv");
        while (true) {
            System.out.println("1. Add book\n2. Delete book\n3. Search book\n4. Exit");
            System.out.println("Input operation:");
            Scanner scanner = new Scanner(System.in);
            int operation = -1;
            try {
                operation = scanner.nextInt();
            } catch (InputMismatchException e) { }

            if(operation == 1){

            } else if(operation == 2) {

            } else if (operation == 3){

            } else if (operation == 4){
                System.exit(0);
            } else {
                System.out.println("Try one more time!");
            }
        }
    }
}
