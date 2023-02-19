public class UserState implements State{
    @Override
    public void addBook() {
        System.out.println("You don't have permissions to access this option");
    }

    @Override
    public void updateBook() {
        System.out.println("You don't have permissions to access this option");
    }

    @Override
    public void deleteBook() {
        System.out.println("You don't have permissions to access this option");
    }

    @Override
    public void pickBook() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public void showMyBooks() {

    }
}
