/**
 * Implement the Book and Author classes based on the class diagram and description given below.
 * Author
 * Implement the getter and setter methods appropriately.
 * Book
 * Method Description
 * displayAuthorDetails()
 * Display the details of the author for the book.
 * Implement the getter and setter methods appropriately.
 * Test your code using the Tester class.
 * Sample Input and Output
 * Input
 * For Author object author1
 * Instance Variables           Values
 * name                        Joshua Bloch
 * emailId                     joshua@email.com
 * gender                           M
 * Instance Variables           Values
 * name                        Effective Java
 * author                      author1
 * price                        $45
 * quantity                      15
 * 
 * Output
 * Displaying Author Details
 * Author Name: Joshua Bloch
 * Author Email:joshua@email.com
 * Author gender: M
 */
class Author {
    private String name;
    private String emailId;
    private char gender;
}
class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;
    public void displayAuthorDetails() {
        System.out.println("Displaying Author Details");
        System.out.println("Author Name: " + author.getName());
        System.out.println("Author Email: " + author.getEmailId());
        System.out.println("Author gnedr: " + author.getGender());
    }
}
public class Assignment_4 {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setName("Joshua Bloch");
        author1.setEmailId("joshua@email.com");
    }
}
