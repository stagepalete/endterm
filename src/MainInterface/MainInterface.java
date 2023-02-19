package MainInterface;

import Users.*;

import java.util.ArrayList;

public class MainInterface implements Login, Register{
    private static int UserOption;
    private static User currentUser = null;

    public static void menu(){
        if(currentUser == null){
            LoginMenu();
        }else{

        }
    }




    public static void MainMenu(){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Show all available books");
        menu.add("Pick up books");
        menu.add("Search");
        menu.add("Return book");
        menu.add("MyBooks");
        int c = 1;
        for (String elem:menu){
            System.out.println("%d) %s".formatted(c++, elem));
        }
    }

    public static void SearchMenu(){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Search by id");
        menu.add("Search by name");
        menu.add("Search by author");
        int c = 1;
        for (String elem:menu){
            System.out.println("%d) %s".formatted(c++, elem));
        }
    }
    public static void LoginMenu(){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Login"); menu.add("Register");
        int c = 1;
        for (String elem:menu){
            System.out.println("%d) %s".formatted(c++, elem));
        }
    }
    @Override
    public void Login() {

    }

    @Override
    public void register() {

    }
}
