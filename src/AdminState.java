import java.sql.SQLException;

public class AdminState implements State{

    @Override
    public void addBook(String name, String author, String date, String isbn) throws SQLException {
        String query = "INSERT INTO `books`(`id`, `name`, `author`, `year_of_publish`, `isbn`) VALUES (NULL, '%s', '%s', '%s', '%s')".formatted(name, author, date, isbn);
        DatabaseConnector.executeQuery(query);
        System.out.println("Book successfully added");
    }

    @Override
    public void updateBook() {

    }

    @Override
    public void deleteBook() {

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
