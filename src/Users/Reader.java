package Users;

import States.State;

public class Reader extends User {

    public Reader(){
        super();
    }
    public Reader(int id, String name, String lastname, String username, String password) {
        super(id, name, lastname, username, password);
    }


    public void setState(State state){
        super.setState(state);
    }
}
