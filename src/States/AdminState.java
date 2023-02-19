package States;

import Database.DatabaseConnector;

import java.sql.SQLException;

public class AdminState implements State {

    @Override
    public void addBook(String name, String author, String date, String isbn) throws SQLException {
        String query = "INSERT INTO `books`(`id`, `name`, `author`, `year_of_publish`, `isbn`) VALUES (NULL, '%s', '%s', '%s', '%s')".formatted(name, author, date, isbn);
        DatabaseConnector.executeQueryCUD(query);
        System.out.println("Books.Book successfully added!");
    }

    @Override
    public void updateBook(int id, String name, String author, String date, String isbn) throws SQLException {
        String query = "UPDATE `books` SET `name`='%s',`author`='%s',`year_of_publish`='%s',`isbn`='%s' WHERE `id` = %d".formatted(name, author, date, isbn, id);
        DatabaseConnector.executeQueryCUD(query);
        System.out.println("Books.Book %s successfully updated!");
    }

    @Override
    public void deleteBook(int id) throws SQLException {
        String query = "DELETE FROM `books` WHERE `id` = %d".formatted(id);
        DatabaseConnector.executeQueryCUD(query);
        System.out.println("Books.Book %d successfully deleted");
    }

    @Override
    public void pickBook(int user_id, int book_id, String day_of_acq, String day_of_return) {

    }

    @Override
    public void returnBook(int id) {

    }

    @Override
    public void showMyBooks(int id) {

    }
}
