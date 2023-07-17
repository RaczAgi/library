import java.util.*;
public class Library {

        List<Reader> readers = new ArrayList<>();

        List<Book> books = new ArrayList<>();


    public String findBookAuthor(String author) throws BookNotFoundException{
        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                return book.toString();
            }
        }throw new BookNotFoundException("Ilyen könyv nincs!");
    }
        public String findBookTitle(String title)throws BookNotFoundException{
            for (Book book : books) {
                if (title.equals(book.getTitle())) {
                    return book.toString();
                }
            }throw new BookNotFoundException("Ilyen könyv nincs!");
        }
    public String findBookGenre(String genre) throws BookNotFoundException{
        for (Book book : books) {
            if (genre.equals("romantikus")) {
                return book.toString();
            }
        }throw new BookNotFoundException("Ilyen könyv nincs!");
    }
}
