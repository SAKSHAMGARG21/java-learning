class Publication {
    private String title;
    private int price;

    public Publication(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}

class Book extends Publication {
    private int pages;
    private String author;

    public Book(String title, int price, int pages, String author) {
        super(title, price);
        this.pages = pages;
        this.author = author;
    }

    public void putdata() {
        System.out.println("Book Title \"" + getTitle() + "\", written by \"" + author + "\" has " + pages + " pages and of " + getPrice() + " rupees.");
    }
}

class CD extends Publication {
    private int length;

    public CD(String title, int price, int length) {
        super(title, price);
        this.length = length;
    }

    public void putdata() {
        System.out.println("CD Title \"" + getTitle() + "\", is of " + length + " minutes length and of " + getPrice() + " rupees.");
    }
}

public class BookCd {

    
    public static void main(String[] args) {
        // Sample Input
        Book book = new Book("Programming-In-C", 150, 1025, "Schildt");
        CD cd = new CD("Rock-On", 50, 185);

        // Sample Output
        book.putdata();
        cd.putdata();
    }
}
