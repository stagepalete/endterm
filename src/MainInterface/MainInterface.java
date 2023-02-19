package MainInterface;

import Users.*;

import java.util.ArrayList;

public class MainInterface {
    private static int UserOption;
    private User currentUser;

    public static void menu(){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Login"); menu.add("Register");
    }


}
