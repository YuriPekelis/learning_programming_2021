package andriy.library;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;

public class LibraryOperator {

    private String filepath;
    private BookRecord headers;
    private File libraryFile;
    private List <BookRecord> libraryState;


    /**
     * Constructor that reads file with filepath and creates headers
     * @param filepath: path for the file with saved data
     * @throws FileNotFoundException if there is no file with defined path
     */
    public LibraryOperator(String filepath) throws FileNotFoundException, NoSuchFieldException, IllegalAccessException {
        this.filepath = filepath;
        this.libraryState = this.readAndParseLines();
        this.readHeaders();
    }

    private void readHeaders () throws FileNotFoundException {
        this.headers = this.libraryState.get(0);
    }

    /**
     * Read and  parse library state from file
     * @return parsed state
     * @throws FileNotFoundException if there is no such ficle
     */
    private List <BookRecord> readAndParseLines() throws FileNotFoundException, NoSuchFieldException, IllegalAccessException {
        List <BookRecord> lines = new ArrayList<>();
        try {
            this.libraryFile = new File(this.filepath);
            Scanner myReader = new Scanner(this.libraryFile);
            while (myReader.hasNext()) {
                lines.add(new BookRecord(myReader.nextLine()));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw e;
        }
        return lines;
    }

    public void addBook() throws FileNotFoundException, NoSuchFieldException, IllegalAccessException {
//        List <String> currentBook = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        String[] attrBookOrder = this.headers.getAttrOrder();
//        for (int i=0; i<this.attrOrder.length; i++) {
//                System.out.println("Please add your book attribute #" + (i+1));
//                Field field = this.getClass().getDeclaredField(this.attrOrder[i]);
//                field.set(this, scanner.nextLine());
//            }
//        }
//        try {
//            BufferedWriter libraryFileWr = new BufferedWriter(new FileWriter(this.filepath, true));
//            String resultString = String.join(";", currentBook);
//            libraryFileWr.newLine();
//            libraryFileWr.append(resultString);
//            libraryFileWr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        this.libraryState = this.readAndParseLines();
    }

    public void deleteBook() {

    }

    public void searchBook() {
//        System.out.println("Please choose type of searching attribute");
//        for (int i=0; i<headers.length; i++) {
//            System.out.println(String.format("%s. %s", i+1, headers[i]));
//        }
//        Scanner scanner = new Scanner(System.in);
//        int attributeIdx = -1;
//        try {
//            attributeIdx = scanner.nextInt();
//        } catch (InputMismatchException e) { }
//        if ((attributeIdx > 0) && (attributeIdx <= headers.length)) {
//            System.out.println(String.format("Enter your %s :", headers[attributeIdx-1]));
////            headers[attributeIdx-1];
//            String searchingAttribute = scanner.next();
//            List <String []> foundBooks = new ArrayList<>();;
//            for (int i = 1; i < libraryState.size(); i++) {
//                if (searchingAttribute.equals(libraryState.get(i)[attributeIdx - 1])){
//                    foundBooks.add(libraryState.get(i));
//                }
//            }
//            System.out.println(String.format("Founded books are:"));
//            for (String[] currentBook: foundBooks) {
//                System.out.println(Arrays.toString(currentBook));
//            }
//        } else {
//            System.out.println("You chose wrong attribute");
//        }
    }
}


