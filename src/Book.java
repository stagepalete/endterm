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
    public void show() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.print("Status: ");
        if (isBorrowed)
            System.out.println("Not Available");
        else
            System.out.println("Available");
        System.out.println();
    }
}
}

