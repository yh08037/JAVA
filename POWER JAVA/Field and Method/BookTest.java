
class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("My first book");
        myBook.setAuthor("Kim");

        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
    }
}
