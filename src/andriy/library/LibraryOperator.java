package andriy.library;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class LibraryOperator {

    private String filepath;
    private String[] headers;
    private File libraryFile;

    public LibraryOperator(String filepath) throws FileNotFoundException {
        this.filepath = filepath;
        this.readHeaders();
    }

    private void readHeaders () throws FileNotFoundException {
        this.headers = this.readAndParseLines().get(0);
    }

    private List <String []> readAndParseLines() throws FileNotFoundException {
        List <String []> lines = new ArrayList<>();
        try {
            this.libraryFile = new File(this.filepath);
            Scanner myReader = new Scanner(this.libraryFile);
            while (myReader.hasNext()) {
                lines.add(myReader.nextLine().split(";"));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw e;
        }
        return lines;
    }

    public void addBook() {
        List <String> currentBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<headers.length; i++) {
            System.out.println("Please add your book " + headers[i]);
            currentBook.add(scanner.nextLine());
        }
        try {
            BufferedWriter libraryFileWr = new BufferedWriter(new FileWriter(this.filepath, true));
            String resultString = String.join(";", currentBook);
            libraryFileWr.newLine();
            libraryFileWr.append(resultString);
            libraryFileWr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook() {

    }

    public void searchBook() {
        System.out.println("Please choose type of searching attribute");
        for (int i=0; i<headers.length; i++) {
            System.out.println(String.format("%s. %s", i+1, headers[i]));
        }
        Scanner scanner = new Scanner(System.in);
        int attributeIdx = -1;
        try {
            attributeIdx = scanner.nextInt();
        } catch (InputMismatchException e) { }
        if ((attributeIdx > 0) && (attributeIdx <= headers.length)) {
            System.out.println(String.format("Enter your %s :", headers[attributeIdx-1]));
//            headers[attributeIdx-1];
            String searchingAttribute = scanner.next();

        } else {
            System.out.println("You chose wrong attribute");
        }
    }
}


