package MainInterface;

import java.util.ArrayList;

public class Menu {
    public static void UserMenu(){
        // Shows all available methods
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Show all available books");
        menu.add("Pick up books");
        menu.add("Search books");
        menu.add("Return book");
        menu.add("Show my books");
        menu.add("Log out");
        menu.add("Exit");
        showOptions(menu);
    }
    public static void AdminMenu(){
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Add book");
        menu.add("Delete book");
        menu.add("Search book");
        menu.add("Update book");
        menu.add("Back");
        showOptions(menu);
    }
    public static void SearchMenu(){
        //Shows searching methods
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Search by id");
        menu.add("Search by name");
        menu.add("Search by author");
        menu.add("Back");
        showOptions(menu);
    }
    public static void AuthMenu(){
        // Shows login options
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Login");
        menu.add("Register");
        menu.add("Back");
        showOptions(menu);
    }
    public static void showOptions(ArrayList<String> options){
        int c = 1;
        for (String elem:options){
            System.out.printf("%d) %s%n", c++, elem);
        }
    }
}
