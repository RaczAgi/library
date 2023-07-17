import java.util.List;
public class Book {
    protected final String title;
    protected final List<String> author;
    protected final int edition;
    protected int copyNumber;

    public Book(String title, List<String> author, int edition, int copyNumber) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.copyNumber = copyNumber;
    }




    public String getTitle() {
        return title;
    }

    public List<String> getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    public int getCopyNumber() {
        return copyNumber;
    }

    public void setCopyNumber(int copyNumber) {
        this.copyNumber = copyNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", edition=" + edition +
                ", copyNumber=" + copyNumber +
                '}';
    }
}
