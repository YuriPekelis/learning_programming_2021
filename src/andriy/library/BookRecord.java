package andriy.library;

import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class BookRecord {
   // ID;Author;Title;Year;Pages;Publisher
    private String id;
    private String author;
    private String title;
    private String year;
    private String pages;
    private String publisher;
    private final String[] attrOrder = {"id", "author", "title", "year", "pages", "publisher"};

    public BookRecord(String bookOptions) throws NoSuchFieldException, IllegalAccessException {
        String[] splittedBookOptions = bookOptions.split(";");
        for(int i=0; i< splittedBookOptions.length; i++) {
          Field field = this.getClass().getDeclaredField(this.attrOrder[i]);
          field.set(this, splittedBookOptions[i]);
        }
    }

    public String[] getAttributes() throws IllegalAccessException, NoSuchFieldException {
        String[] allAttr = new String[this.attrOrder.length];
        for(int i=0; i< this.attrOrder.length; i++) {
            Field field = this.getClass().getDeclaredField(this.attrOrder[i]);
            allAttr[i] = (String) field.get(this);
        }
        return allAttr;
    }


    @Override
    public String toString() {
        return String.format("ID: %s\nAuthor:%s\nTitle:%s\nyear:%s\nPages:%s",
                this.id, this.author, this.title, this.year, this.pages);
    }

}
