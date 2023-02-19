public class Book {
    private int id;
    private String name;
    private String author;
    private int year_of_publish;
    private String isbn;
    public Book(int id, String name, String author, int year_of_publish, String isbn) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year_of_publish = year_of_publish;
        this.isbn = isbn;
    }
}