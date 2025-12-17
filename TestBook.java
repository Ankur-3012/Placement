class Book{
    String title;
    int pages;

    Book(String t, int p){
        title = t;
        pages = p;
    }
}

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 300);
        Book b2 = new Book("DSA in Java", 500);

        System.out.println( b1.title + "-" + b1.pages);
        System.out.println( b2.title + "-" + b2.pages);
    }
    
}
