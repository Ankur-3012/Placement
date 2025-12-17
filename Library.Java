class Book {

    private String title;
    private String author;
    private boolean status; 


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getStatus() {
        return status;
    }


    public void borrowBook() {
        if (getStatus()  == true) {
            setStatus(false);
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        if (getStatus() == false) {
            setStatus(true);
            System.out.println(title + " has been returned.");
        } 
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setTitle("1984");
        book1.setAuthor("George Orwell");
        book1.setStatus(false);
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println();
        book1.borrowBook();
        System.out.println();
        book1.returnBook();

        System.out.println();
        book2.setTitle("Wings of Fire");
        book2.setAuthor("A. P. J. Abdul Kalam");
        book2.setStatus(true);
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println();
        book2.borrowBook();
        System.out.println();
        book2.returnBook();
    }
}
