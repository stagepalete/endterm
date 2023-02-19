import java.sql.SQLException;

public interface State {
//    Admin methods
    public void addBook() throws SQLException;

    public void updateBook();

    public void deleteBook();


//    User methods
    public void pickBook();
    public void returnBook();
    public void showMyBooks();
}
