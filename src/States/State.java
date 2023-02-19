package States;

import java.sql.SQLException;

public interface State {
//    Admin methods
    void addBook(String name, String author, String date, String isbn) throws SQLException;

    public void updateBook(int id, String name, String author, String date, String isbn) throws SQLException;

    public void deleteBook(int id) throws SQLException;


//    Users.User methods
    public void pickBook(int user_id, int book_id, String day_of_acq, String day_of_return) throws SQLException;


    public void returnBook();
    public void showMyBooks();
}
