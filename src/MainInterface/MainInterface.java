package MainInterface;

import Books.Book;
import Users.*;

import java.io.Console;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
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
            }else if(currentUser.getClass() != Admin.class){
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
                    currentUser = Login.Login(username, password);
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

    public static void UserMenu(){
        try {
            System.out.print("Choose option: ");
            UserOption = Integer.parseInt(input.next());
            switch (UserOption) {
                case 1 -> {

                    Book.showAllAvailableBooks();
                }
                case 2 -> {
                    Book.showAllAvailableBooks();
                    System.out.print("Enter book id from list below: ");
                    int id = Integer.parseInt(input.next());
                    String day_of_a = null;
                    String day_of_r = null;
                    while(day_of_a == null && day_of_r == null){
                        System.out.print("Enter day of acquisition(YYY-MM-DD): ");
                        String day_of_acq = input.next();
                        day_of_a= DateValidator.DateFormatValidate(day_of_acq);
                        if(day_of_a == null){
                            continue;
                        }
                        System.out.print("Enter day of return(YYYY-MM-DD): ");
                        String day_of_return = input.next();
                        day_of_r = DateValidator.DateFormatValidate(day_of_return);
                        if(day_of_r == null){
                            continue;
                        }
                    }

                    assert day_of_r != null;
                    if(!DateValidator.DateTimeLineValidate(day_of_a,day_of_r)){
                        System.out.println("Stop");
                    }

                    currentUser.pickBook(currentUser.getID(), id, day_of_a, day_of_r);
                }
                case 3 ->{
                    Menu.SearchMenu();
                    System.out.print("Choose option: ");
                    UserOption = Integer.parseInt(input.next());
                    switch (UserOption){
                        case 1 -> {
                            System.out.print("Enter book id: ");
                            int book_id = Integer.parseInt(input.next());
                            Book.searchById(book_id);
                        }
                        case 2 -> {
                            System.out.print("Enter book name: ");
                            String book_name = input.next();
                            Book.searchByName(book_name);
                        }
                        case 3->{
                            System.out.print("Enter author's name: ");
                            String author_name = input.next();
                            Book.searchByAuthor(author_name);
                        }
                    }
                }
                case 4 -> {
                    currentUser.showMyBooks(currentUser.getID());
                    System.out.println("Choose id of book: ");
                    int book_id = Integer.parseInt(input.next());
                    currentUser.returnBook(book_id, currentUser.getID());
                }
                case 5->{
                    currentUser.showMyBooks(currentUser.getID());
                }
                case 6-> {
                    currentUser = null;
                }
                case 7->{
                    System.exit(0);
                }
            }
        }catch (NumberFormatException e) {
            System.out.println("Error: You must enter an integer.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static void AdminMenu(){
        try{
            System.out.print("Choose option: ");
            UserOption = Integer.parseInt(input.next());
            switch (UserOption) {
                case 1 -> {
                    System.out.print("Enter book name: ");
                    String name = input.next();
                    System.out.print("Enter book author: ");
                    String author = input.next();
                    System.out.print("Enter year of publish(YYYY-MM-DD): ");
                    String year_of_publish = input.next();
                    year_of_publish = DateValidator.DateFormatValidate(year_of_publish);
                    System.out.println("Enter ISBN: ");
                    String isbn = input.next();
                    currentUser.addBook(name, author, year_of_publish, isbn);
                }
                case 2 -> {
                    Book.showAllAvailableBooks();
                    System.out.print("Enter book id: ");
                    int id = Integer.parseInt(input.next());
                    System.out.print("Enter book name: ");
                    String name = input.next();
                    System.out.print("Enter book author: ");
                    String author = input.next();
                    System.out.print("Enter year of publish(YYYY-MM-DD): ");
                    String year_of_publish = input.next();
                    year_of_publish = DateValidator.DateFormatValidate(year_of_publish);
                    System.out.print("Enter ISBN: ");
                    String isbn = input.next();
                    currentUser.updateBook(id, name, author, year_of_publish, isbn);
                }
                case 3 ->{
                    
                }
                case 6->{
                    currentUser = null;
                }
            }
        }
        catch (NumberFormatException e){
            System.out.println("Error: You must enter an integer.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
