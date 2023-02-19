package MainInterface;

import States.*;
import Users.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainInterface implements Login, Register{
    private static int UserOption;
    private static User currentUser = null;
    public static void menu(){
        if(currentUser == null){
            Menu.LoginMenu();
        }else if(!User.isAdmin()){
            Menu.UserMenu();
        }else{
            Menu.AdminMenu();
        }
    }





    @Override
    public void Login() {

    }

    @Override
    public void register() {

    }
}
