package MainInterface;

import Database.DatabaseConnector;
import Users.Reader;
import Users.User;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public interface Login {
    static User Login(String username, String password) throws SQLException {
        String query = "Select * from `users`";
        ResultSet resultset = DatabaseConnector.executeQueryRead(query);
        while(resultset.next()){
            if(Objects.equals(resultset.getString("username"), username) && Objects.equals(resultset.getString("password"), password)){
                int id = resultset.getInt("id");
                String name = resultset.getString("name");
                String lastname =resultset.getString("lastname");
                if(Objects.equals(resultset.getString("isAdmin"), "0")){
                    return null;
                }else if(Objects.equals(resultset.getString("isAdmin"), "1")){
                    System.out.printf("Welcome, %s%n", name);
                    return new Reader(id, name, lastname, username);
                }
            }else{
                System.out.println("Wrong username or password!");
                return null;
            }
        }
        return null;
    }

}
