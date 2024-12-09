class Writer {
    String name;
    String email;
    char gender;

    public Writer(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Writer[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

class Book {
    String name;
    double price;
    Writer writer;
    int qty;

    public Book(String name, Writer writer, double price) {
        this.name = name;
        this.writer = writer;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Writer writer, double price, int qty) {
        this.name = name;
        this.writer = writer;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + name + "," + writer.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}

public class writerandBook {
    public static void main(String[] args) {
        // Create a Writer object
        Writer writer = new Writer("Girdhar Gopal", "girdhar@codequotient.com", 'm');

        // Create a Book object
        Book book = new Book("Java Programming", writer, 499.99, 10);

        // Display the book details
        System.out.println(book.toString());
    }

}
