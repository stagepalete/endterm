package States;

import States.State;

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
    public void pickBook() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public void showMyBooks() {

    }
}
