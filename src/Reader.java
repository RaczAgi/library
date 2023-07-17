import java.util.List;
public class Reader {

    protected String name;
    protected final int readingTicket;
    protected List<Genre> preferredGenre;


    public Reader(String name, int readingTicket, List<Genre> preferredGenre) {
        this.name = name;
        this.readingTicket = readingTicket;
        this.preferredGenre = preferredGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReadingTicket() {
        return readingTicket;
    }

    public List<Genre> getPreferredGenre() {
        return preferredGenre;
    }

    public void setPreferredGenre(List<Genre> preferredGenre) {
        this.preferredGenre = preferredGenre;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", readingTicket=" + readingTicket +
                ", preferredGenre=" + preferredGenre +
                '}';
    }
}
