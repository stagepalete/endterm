package Users;


import MainInterface.Login;
import MainInterface.Register;
import States.State;
import States.UserState;

public class User {
    private static int ID;
    private static String NAME;
    private static String LASTNAME;
    private static String USERNAME;
    private static String PASSWORD;
    private static boolean isAdmin = false;
    private State state = new UserState();
    User(){};
    public User(int id, String name, String lastname, String username, String password){
        ID = id;
        NAME = name;
        LASTNAME = lastname;
        USERNAME = username;
        PASSWORD = password;
    }


    public void setState(State state){
        this.state = state;
    }


    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public static boolean isAdmin(){
        return isAdmin;
    }



}
