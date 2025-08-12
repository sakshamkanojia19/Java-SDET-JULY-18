package Java_25_07;

public class Encapsu_Book {
 
	  // Private fields
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable = true;  // default: available

    // Constructor
    public Encapsu_Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Issue method
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println(" Book already issued.");
        }
    }

    // Return method
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not issued.");
        }
    }

    // Book info
    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println(" ISBN: " + isbn);
        System.out.println(" Availability: " + (isAvailable ? "Available" : "Issued"));
    }

    public static void main(String[] args) {
    	Encapsu_Book b1 = new Encapsu_Book("Atomic Habits", "James Clear", "123-456");
        b1.getInfo();

        b1.issueBook();   // First issue
        b1.issueBook();   // Should fail
        b1.returnBook();  // Return
        b1.returnBook();  // Should fail

        System.out.println("--------");

        Encapsu_Book b2 = new Encapsu_Book("The Alchemist", "Paulo Coelho", "789-012");
        b2.getInfo();
    }
	 
}
