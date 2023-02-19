package MainInterface;

import Database.DatabaseConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public interface Register {
    static void Register(String name, String lastanme, String username, String password) throws SQLException {
        String query = "INSERT INTO `users` (`id`, `name`, `lastname`, `username`, `password`, `isAdmin`) VALUES (NULL, '%s', '%s', '%s', '%s', '0')".formatted(name, lastanme, username, password);
        DatabaseConnector.executeQueryCUD(query);
        System.out.println("User successfully created!");
    }

    static boolean ValidatePassword(String password1, String password2){
        if(!Objects.equals(password1, password2)){
            System.out.println("Passwords are not same! Please, try again");
            return false;
        }

        return true;
    }
    static boolean CheckUsername(String username) throws SQLException {
        String query = "Select * from `users`";
        ResultSet resultset = DatabaseConnector.executeQueryRead(query);
        while(resultset.next()){
            if(Objects.equals(resultset.getString("username"), username)){
                System.out.println("Username is already taken");
                return false;
            }
        }
        return true;
    }

}
