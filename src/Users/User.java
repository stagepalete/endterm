package Users;


import MainInterface.Login;
import MainInterface.Register;
import States.State;
import States.UserState;

import java.sql.SQLException;

public class User{
    private static int ID;
    private static String NAME;
    private static String LASTNAME;
    private static String USERNAME;
    private State state = new UserState();
    User(){};
    public User(int id, String name, String lastname, String username){
        ID = id;
        NAME = name;
        LASTNAME = lastname;
        USERNAME = username;
    }


    public void setState(State state){
        this.state = state;
    }


    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public String getUSERNAME() {
        return USERNAME;
    }
    public State getState(){
        return state;
    }

    public void pickBook(int user_id, int book_id, String day_of_acq, String day_of_return) throws SQLException {
        state.pickBook(user_id, book_id, day_of_acq, day_of_return);
    }

    public void showMyBooks(int id) throws SQLException {
        state.showMyBooks(id);
    }

    public void returnBook(int book_id, int user_id) throws SQLException {
        state.returnBook(book_id, user_id);
    }

    public void addBook(String name, String author, String date, String isbn) throws SQLException {
    }
    public void updateBook(int id, String name, String author, String date, String isbn) throws SQLException {

    }
    public void deleteBook(int id) throws SQLException {

    }

    public boolean checkBookExistence(int bookId) throws SQLException {
        return state.checkBookExistence(bookId);
    }
    public boolean checkUserBooks(int user_id) throws SQLException{
        return state.checkUserBooks(user_id);
    }
}
