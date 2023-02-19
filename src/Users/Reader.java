package Users;

import States.State;
import States.UserState;

import java.sql.SQLException;

public class Reader extends User {

    public Reader(){
        super();
    }
    public Reader(int id, String name, String lastname, String username) {
        super(id, name, lastname, username);
    }


    public void pickBook(int user_id, int book_id, String day_of_acq, String day_of_return) throws SQLException {
        super.getState().pickBook(user_id, book_id, day_of_acq, day_of_return);
    }

    public void setState(State state){
        super.setState(state);
    }
}
