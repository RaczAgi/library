import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Reader> readers = new ArrayList<>();
        readers.add(new Reader("Anna", 0001, List.of(Genre.ROMANTIC, Genre.CRIME)));
        readers.add(new Reader("Béla", 0002, List.of(Genre.CRIME, Genre.SCIENCEFICTION)));
        readers.add(new Reader("Cecil", 0003, List.of(Genre.ROMANTIC)));
        readers.add(new Reader("Dénes", 0004, List.of(Genre.CRIME)));
        readers.add(new Reader("Emma", 0005, List.of(Genre.DRAMA)));

        for (var actual : readers) {
            System.out.println(actual);
        }
        System.out.println();
        List<Book> books = new ArrayList<>();
        books.add(new Book("A gyűrűk ura", List.of("Tolkien"), 2000, 5));
        books.add(new Book("A szív szava", List.of("Ez", "MegAz"), 1930, 1));
        books.add(new Book("Szomorú történet", List.of("Őírta"), 2005, 2));
        books.add(new Book("Az gyilkos visszatér", List.of("Krimiíró"), 2010, 5));

        for (var actual : books) {
            System.out.println(actual);
        }

    }
}