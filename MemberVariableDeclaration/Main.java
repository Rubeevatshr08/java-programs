package MemberVariableDeclaration;

class Book 
{
    private String bookName;
    private String publisher;

    Book()
    {

    }
    Book(String bookName, String publisher)
    {
        this.bookName = bookName;
        this.publisher = publisher;
    }

    public String getBookName()
    {
        return bookName;
    }
    
    public void setBookName(String bookName) 
    {
        this.bookName = bookName;
    }


}
public class Main
{
    public static void main(String[] args) {
      Book book1 = new Book();
      //book1.setBookName("gate");
      
      System.out.println(book1.getBookName());
    }
}