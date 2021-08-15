package andriy.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LibraryOperator {

    private String filepath;
    private String[] headers;
    private File libraryFile;

    public LibraryOperator(String filepath) throws FileNotFoundException {
        this.filepath = filepath;
        this.readHeaders();
    }

    private void readHeaders () throws FileNotFoundException {
        try {
            this.libraryFile = new File(this.filepath);
            Scanner myReader = new Scanner(this.libraryFile);
            this.headers = myReader.nextLine().split(";");
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw e;
        }
    }

    public void addBook() {
        List <String> currentBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<headers.length; i++) {
            System.out.println("Please add your book " + headers[i]);
            currentBook.add(scanner.nextLine());
        }
        try {
            FileWriter libraryFile = new FileWriter(this.filepath);
            String resultString = String.join(";", currentBook);
            libraryFile.write(resultString);
            libraryFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook() {

    }

    public void searchBook() {

    }
}


