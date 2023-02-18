import java.util.Scanner;
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
public class BookInfo{
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        Book[] books = new Book[num];
        String title;
        String author;
        for (int i = 0; i < num; i++) {
            title = input.nextLine();
            author = input.nextLine();
            books[i] = new Book(title,author);
        }
        for (int i = 0; i < num; i++) {
            books[i].show();
        }
    }


