package Users;

import States.State;

public class Reader extends User {

    public Reader(){
        super();
    }
    public Reader(int id, String name, String lastname, String username) {
        super(id, name, lastname, username);
    }


    public void setState(State state){
        super.setState(state);
    }
}
