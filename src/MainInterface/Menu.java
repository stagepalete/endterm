package MainInterface;

import java.util.ArrayList;

public class Menu {
    public static void UserMenu(){
        // Shows all available methods
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Show all available books");
        menu.add("Pick up books");
        menu.add("Search");
        menu.add("Return book");
        menu.add("MyBooks");
        showOptions(menu);
    }
    public static void AdminMenu(){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Add book");
        menu.add("Delete book");
        menu.add("Search book");
        menu.add("Update book");
        showOptions(menu);
    }
    public static void SearchMenu(){
        //Shows searching methods
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Search by id");
        menu.add("Search by name");
        menu.add("Search by author");
        showOptions(menu);
    }
    public static void LoginMenu(){
        // Shows login options
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Login"); menu.add("Register");
        showOptions(menu);
    }
    public static void showOptions(ArrayList<String> options){
        int c = 1;
        for (String elem:options){
            System.out.printf("%d) %s%n", c++, elem);
        }
    }
}
