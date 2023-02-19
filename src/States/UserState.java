package States;

import Database.DatabaseConnector;

import java.sql.SQLException;

public class UserState implements State {
    @Override
    public void addBook(String name, String author, String date, String isbn) throws SQLException {
        System.out.println("You don't have permissions to access this option");
    }

    @Override
    public void updateBook(int id, String name, String author, String date, String isbn) {
        System.out.println("You don't have permissions to access this option");
    }

    @Override
    public void deleteBook(int id) throws SQLException {
        System.out.println("You don't have permissions to access this option");
    }


    @Override
    public void pickBook(int user_id, int book_id, String day_of_acq, String day_of_return) throws SQLException {
        String query = "INSERT INTO `book-user`(`id`, `user_id`, `book_id`, `day_of_acquisition`, `day_of_return`) VALUES (NULL,'%d','%d','%s','%s')".formatted(user_id, book_id, day_of_acq, day_of_return);
        DatabaseConnector.executeQueryCUD(query);
        System.out.println("Book added to your list");
    }

    @Override
    public void returnBook() {

    }

    @Override
    public void showMyBooks() {

    }
}
