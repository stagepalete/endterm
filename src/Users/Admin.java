package Users;

import MainInterface.DateValidator;
import States.State;

import java.sql.SQLException;

public class Admin extends User{
    public Admin(int id, String name, String lastname, String username, State adminState) {
        super(id, name, lastname, username);
        super.setState(adminState);
    }

    @Override
    public void addBook(String name, String author, String date, String isbn) throws SQLException {
        date = DateValidator.DateFormatValidate(date);
        this.getState().addBook(name, author, date, isbn);
    }
    @Override
    public void updateBook(int id, String name, String author, String date, String isbn) throws SQLException {
        date = DateValidator.DateFormatValidate(date);
        this.getState().updateBook(id, name, author, date, isbn);
    }
}
