package States;

import Database.DatabaseConnector;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
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
    public void returnBook(int book_id, int user_id) throws SQLException {
        String query = "DELETE FROM `book-user` WHERE `book-user`.`book_id` = '%d' and `user_id` = '%d'".formatted(book_id, user_id);
        DatabaseConnector.executeQueryCUD(query);
        System.out.println("Book returned");
    }

    @Override
    public void showMyBooks(int user_id) throws SQLException {
        System.out.println();
        String query = "SELECT books.*,  `book-user`.`day_of_acquisition`, `book-user`.`day_of_return` from `book-user`JOIN books ON `book-user`.`book_id` = books.id  where `book-user`.`user_id` = %d".formatted(user_id);
        ResultSet resultSet= DatabaseConnector.executeQueryRead(query);
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String author = resultSet.getString("author");
            String year_of_publish = resultSet.getString("year_of_publish");
            String isbn = resultSet.getString("isbn");
//            String day_of_acquisition = resultSet.getString("day_of_acquisition");
            String day_of_return = resultSet.getString("day_of_return");
            System.out.println("%d) %s, %s, %s, %s (return day: %s)". formatted(id, name, author, year_of_publish, isbn, day_of_return));
        }
        System.out.println();
    }

    public boolean checkUserBooks(int user_id) throws SQLException{
        String query = "Select * from `book-user` where `user_id` = %d".formatted(user_id);
        ResultSet resultSet = DatabaseConnector.executeQueryRead(query);
        if(!resultSet.next()){
            System.out.println("You dont have any book!");
            return false;
        }
        return true;
    }
    @Override
    public boolean checkBookExistence(int id) throws SQLException {
        String query = "Select * from `book-user` where `id` = %d".formatted(id);
        ResultSet resultSet = DatabaseConnector.executeQueryRead(query);
        if(!resultSet.next()){
            System.out.println("There is no field with such id!");
            return false;
        }
        return true;
    }
}
