package MainInterface;

import States.*;
import Users.*;

import java.util.ArrayList;

public class MainInterface implements Login, Register{
    private static int UserOption;
    private static User currentUser = null;


    public static void menu(){
        if(currentUser == null){
            LoginMenu();
        }else if(!User.isAdmin()){
            UserMenu();
        }else{
            AdminMenu();
        }
    }




    public static void UserMenu(){
        // Shows all available methods
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Show all available books");
        menu.add("Pick up books");
        menu.add("Search");
        menu.add("Return book");
        menu.add("MyBooks");
        int c = 1;
        for (String elem:menu){
            System.out.printf("%d) %s%n", c++, elem);
        }
    }
    public static void AdminMenu(){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Add book");
        menu.add("Delete book");
        menu.add("Search book");
        menu.add("Update book");
        int c = 1;
        for (String elem:menu){
            System.out.printf("%d) %s%n", c++, elem);
        }
    }
    public static void SearchMenu(){
        //Shows searching methods
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Search by id");
        menu.add("Search by name");
        menu.add("Search by author");
        int c = 1;
        for (String elem:menu){
            System.out.printf("%d) %s%n", c++, elem);
        }
    }
    public static void LoginMenu(){
        // Shows login options
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Login"); menu.add("Register");
        int c = 1;
        for (String elem:menu){
            System.out.printf("%d) %s%n", c++, elem);
        }
    }
    @Override
    public void Login() {

    }

    @Override
    public void register() {

    }
}
