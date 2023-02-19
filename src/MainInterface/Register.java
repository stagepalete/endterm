package MainInterface;

import java.sql.SQLException;
import java.util.Objects;

public interface Register {
    static void Register(String name, String lastanme, String username, String password1, String password2) {}

    static boolean ValidatePassword(String password1, String password2){
        if(!Objects.equals(password1, password2)){
            System.out.println("Passwords are not same! Please, try again");
            return false;
        }

        return true;
    }
    static void CheckUsername(String username) throws SQLException {

    }
}
