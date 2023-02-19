package Books;

import Database.DatabaseConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Book {


    public static void showAllAvailableBooks() throws SQLException {
        String query = "Select * from `books` where `isAvailable` = 1";
        int c = 1;
        ResultSet resultSet = DatabaseConnector.executeQueryRead(query);

        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String author = resultSet.getString("author");
            String year_of_publish = resultSet.getString("year_of_publish");
            String isbn = resultSet.getString("isbn");
            System.out.println("%d) %s, %s, %s, %s". formatted(id, name, author, year_of_publish, isbn));
        }
    }

}