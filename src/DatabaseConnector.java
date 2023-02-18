import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/libraryassignment";  //Connection URL to database
    private static final String  USERNAME = "root"; //Username to access database
    private static final String PASSWORD = ""; //password to access database
    private static boolean isConnected = false; //Connection status
    public static Connection connect(){ //Method to connect to database
        Connection connection = null; //Initializing connection
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); //Getting connection with getConnect()
            isConnected = true; //Changing connection status to true/ By default its false
        }catch(SQLException e){
            e.printStackTrace();
        }
        return connection; //returning connection
    }

    public static boolean isConnected(){
        return isConnected;
    } //getter connection status to check
}
