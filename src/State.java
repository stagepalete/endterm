import java.sql.SQLException;

public interface State {
//    Admin methods
    void addBook(String name, String author, String date, String isbn) throws SQLException;

    public void updateBook(int id, String name, String author, String date, String isbn) throws SQLException;

    public void deleteBook(int id) throws SQLException;


//    User methods
    public void pickBook();
    public void returnBook();
    public void showMyBooks();
}
