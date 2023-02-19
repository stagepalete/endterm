import java.sql.SQLException;

public class User {
    private static int ID;
    private static String NAME;
    private static String LASTNAME;
    private static String USERNAME;
    private static String PASSWORD;
    private static boolean isAdmin = false;
    private State state = new AdminState();
    User(){};
    public User(int id, String name, String lastname, String username, String password){
        ID = id;
        NAME = name;
        LASTNAME = lastname;
        USERNAME = username;
        PASSWORD = password;
    }

    public void addBook(String name, String author, String date, String isbn) throws SQLException{
        state.addBook(name, author, date, isbn);
    }

    public void setState(State state){
        this.state = state;
    }


    public static int getID() {
        return ID;
    }

    public static String getNAME() {
        return NAME;
    }

    public static String getLASTNAME() {
        return LASTNAME;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

}
