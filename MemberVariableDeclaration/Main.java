package MemberVariableDeclaration;

class Book 
{
    String bookName;
    String publisher;

    Book(String bookName, String publisher)
    {
        this.bookName = bookName;
        this.publisher = publisher;
    }


}
public class Main
{
    public static void main(String[] args) {
      Book book1 = new Book("Information system","Rubee vats");
      System.out.println(book1.bookName);
      System.out.println(book1.publisher);
    }
}