import java.sql.SQLException;

public class Main {
    // TODO:
    // Library: User(State):Class, Book:Class, State(Interface), AdminState(Class of State), UserState(Class of State), Library,
    // Program Interface, DatabaseConnector


    // Arman: Book:Class, Library:Class
    // Miras: Database Connection:Class, Creating Database table
    // Bokhrom: UserState:Class, Main Interface of Program:Class
    // Yedige: State:Interface, AdminState:Class, User

    // DATABASE
    // books: id:int(PK), name, author, yearOfPublish:Date, isbn:String
    // users: id:int(PK), name:String, lastname:String, username:String, password:String(255)
    // Book - User table: id:int, user_id:int(FK), book_id:int(FK), dayOfAcquisition (Date), dayOfReturn (Date)
    public static void main(String[] args) throws SQLException {
    }
}