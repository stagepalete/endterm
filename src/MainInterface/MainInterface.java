package MainInterface;

import Users.*;

import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class MainInterface implements Login, Register{
    private static int UserOption;
    private static User currentUser = null;
    private static final Scanner input = new Scanner(System.in);
    public static void menu(){
        while(true){
            if(currentUser == null){
                Menu.AuthMenu();
                AuthMenu();
            }else if(!User.isAdmin()){
                Menu.UserMenu();
                UserMenu();
            }else{
                Menu.AdminMenu();
                AdminMenu();
            }
        }

    }


    public static void AuthMenu(){
        try{
            System.out.print("Choose option: ");
            UserOption = Integer.parseInt(input.next());
            switch (UserOption){
                case 1 -> {
                    System.out.print("Username: ");
                    String username = input.next();
                    System.out.print("Password: ");
                    String password = input.next();
                    Login.Login(username, password);
                    menu();
                }
                case 2 -> {
                    System.out.print("Name: ");
                    String name = input.next();
                    System.out.print("Lastname: ");
                    String lastname = input.next();
                    System.out.print("Username: ");
                    String username = input.next();
                    while(!Register.CheckUsername(username)){
                        System.out.print("Username: ");
                        username = input.next();
                    }
                    System.out.print("Password: ");
                    String password1 = input.next();
                    System.out.print("Confirm your password: ");
                    String password2 = input.next();
                    while(!Register.ValidatePassword(password1, password2)){
                        System.out.print("Password: ");
                        password1 = input.next();
                        System.out.print("Confirm your password: ");
                        password2 = input.next();
                    }
                    Register.Register(name, lastname, username, password1);
                    menu();
                }
                case 3 -> {
                    menu();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: You must enter an integer.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void UserMenu(){}
    public static void AdminMenu(){}



}
