import java.sql.SQLException;

public interface State {
//    Admin methods
    void addBook(String name, String author, String date, String isbn) throws SQLException;

    public void updateBook();

    public void deleteBook();


//    User methods
    public void pickBook();
    public void returnBook();
    public void showMyBooks();
}
