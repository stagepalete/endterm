package MainInterface;

import Database.DatabaseConnector;
import Users.Admin;
import Users.Reader;
import Users.User;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public interface Login {
    static User Login(String username, String password) throws SQLException {
        String query = "Select * from `users` where `username` = '%s'".formatted(username);
        ResultSet resultset = DatabaseConnector.executeQueryRead(query);
        while(resultset.next()){
            if(Objects.equals(resultset.getString("username"), username) && Objects.equals(resultset.getString("password"), password)){
                String id = resultset.getString("id");
                String name = resultset.getString("name");
                String lastname =resultset.getString("lastname");
                if(Objects.equals(resultset.getString("isAdmin"), "1")){
                    return new Admin(Integer.parseInt(id), name, lastname, username);
                }else if(Objects.equals(resultset.getString("isAdmin"), "0")){
                    System.out.printf("Welcome, %s%n", name);
                    return new Reader(Integer.parseInt(id), name, lastname, username);
                }
            }else{
                System.out.println("Wrong username or password!");
                return null;
            }
        }
        return null;
    }

}
