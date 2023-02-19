package MainInterface;

import Users.*;

import java.util.Scanner;

public class MainInterface{
    private static int UserOption;
    private static User currentUser = null;
    private static final Scanner input = new Scanner(System.in);
    public static void menu(){
        if(currentUser == null){
            Menu.LoginMenu();
            LoginMenu();
        }else if(!User.isAdmin()){
            Menu.UserMenu();
            UserMenu();
        }else{
            Menu.AdminMenu();
            AdminMenu();
        }
    }


    public static void LoginMenu(){
        try{
            UserOption = Integer.parseInt(input.next());
            switch (UserOption){
                case 1:
                    System.out.print("Username: ");
                    String username = input.next();
                    System.out.println("Password: ");
                    String password = input.next();

            }
        } catch (NumberFormatException e) {
            System.out.println("Error: You must enter an integer.");
        }
    }

    public static void UserMenu(){}
    public static void AdminMenu(){}
}
