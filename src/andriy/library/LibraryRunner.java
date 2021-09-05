package andriy.library;

import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(Paths.get("").toAbsolutePath().toString());
        LibraryOperator library = new LibraryOperator("src/andriy/library/library.csv");
        while (true) {
            System.out.println("1. Add book\n2. Delete book\n3. Search book\n4. Exit");
            System.out.println("Input operation:");
            Scanner scanner = new Scanner(System.in);
            int operation = -1;
            try {
                operation = scanner.nextInt();
            } catch (InputMismatchException e) { }

            if(operation == 1){
                library.addBook();
            } else if(operation == 2) {

            } else if (operation == 3){
                library.searchBook();
            } else if (operation == 4){
                System.exit(0);
            } else {
                System.out.println("Try one more time!");
            }
        }
    }
}
