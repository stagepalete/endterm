import java.sql.SQLException;
import MainInterface.MainInterface;
public class Main {
    // TODO:
    // Library: Users.User(States.State):Class, Book:Class, States.State(Interface), States.AdminState(Class of States.State), States.UserState(Class of States.State), Library,
    // Program Interface, Database.DatabaseConnector


    // Arman: Book:Class, Library:Class
    // Miras: Database Connection:Class, Creating Database table
    // Bokhrom: States.UserState:Class, Main Interface of Program:Class
    // Yedige: States.State:Interface, States.AdminState:Class, Users.User

    // DATABASE
    // books: id:int(PK), name, author, yearOfPublish:Date, isbn:String
    // users: id:int(PK), name:String, lastname:String, username:String, password:String(255)
    // Book - Users.User table: id:int, user_id:int(FK), book_id:int(FK), dayOfAcquisition (Date), dayOfReturn (Date)
    public static void main(String[] args) throws SQLException {

    }
}