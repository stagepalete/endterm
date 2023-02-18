public class Book {
    private static Integer nextID = 1000;
    private Integer bookID;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.bookID  = nextID++;
    }

    public void borrowBook(){
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed = false;
    }

    public boolean isBookBorrowed(){
        return isBorrowed;
    }

}

