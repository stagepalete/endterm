import java.sql.SQLException;

public class UserState implements State{
    @Override
    public void addBook(String name, String author, String date, String isbn) throws SQLException {
        System.out.println("You don't have permissions to access this option");
    }

    @Override
    public void updateBook() {
        System.out.println("You don't have permissions to access this option");
    }

    @Override
    public void deleteBook() {
        System.out.println("You don't have permissions to access this option");
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
