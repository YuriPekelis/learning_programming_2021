package andriy.library;

public class BookRecord {
    private String id;
    private String author;
    private String title;
    private String year;
    private String pages;

    @Override
    public String toString() {
        return String.format("ID: %s\nAuthor:%s\nTitle:%s\nyear:%s\nPages:%s",
                this.id, this.author, this.title, this.year, this.pages);
    }

}
