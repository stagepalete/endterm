package MainInterface;

import Users.*;

import java.util.ArrayList;

public class MainInterface implements Login, Register{
    private static int UserOption;
    private static User currentUser = null;

    public static void menu(){
        if(currentUser == null){
            LoginInterface();
        }else{

        }
    }






    public static void LoginInterface(){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Login"); menu.add("Register");
    }
    @Override
    public void Login() {

    }

    @Override
    public void register() {

    }
}
