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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear_of_publish() {
        return year_of_publish;
    }

    public void setYear_of_publish(int year_of_publish) {
        this.year_of_publish = year_of_publish;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}