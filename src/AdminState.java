import javax.xml.crypto.Data;
import java.sql.SQLException;

public class AdminState implements State{

    @Override
    public void addBook(String name, String author, String date, String isbn) throws SQLException {
        String query = "INSERT INTO `books`(`id`, `name`, `author`, `year_of_publish`, `isbn`) VALUES (NULL, '%s', '%s', '%s', '%s')".formatted(name, author, date, isbn);
        DatabaseConnector.executeQuery(query);
        System.out.println("Book successfully added!");
    }

    @Override
    public void updateBook(int id, String name, String author, String date, String isbn) throws SQLException {
        String query = "UPDATE `books` SET `name`='%s',`author`='%s',`year_of_publish`='%s',`isbn`='%s' WHERE `id` = %d".formatted(name, author, date, isbn, id);
        DatabaseConnector.executeQuery(query);
        System.out.println("Book %s successfully updated!");
    }

    @Override
    public void deleteBook(int id) throws SQLException {
        
    }

    @Override
    public void pickBook() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public void showMyBooks() {

    }
}
