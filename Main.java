import java.util.*;

class Books{
    static int totalNoOfBook;

    String author;

    String tittle;

    String isbn;

    boolean isBorrow;

    static {
        totalNoOfBook=0;
    }
    {  // object int
        totalNoOfBook++;
    }
   Books(String isbn,String author,String tittle){
          this.isbn= isbn;
          this.author=author;
          this.tittle=tittle;
   }
   Books(String isbn){
        this(isbn, "unknown", "unknown");
   }
   static int getTotalNoOfBook(){
        return totalNoOfBook;
   }
   void borrowBook(){
       if(isBorrow){
           System.out.println("book is already borrowed");
       }else{
           this.isBorrow= true;
           System.out.println("enjoy the book");
       }
   }
   void returnBook(){
        if(isBorrow){
            this.isBorrow =false;
            System.out.println("hope that book is enjoyed you");
        }else{
            System.out.println("this book is present in library");
        }
   }
    public static void main  (String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the isbn of book:");
            String isbn = scan.next();
            System.out.print("Enter the Authour name of book:");
            String author = scan.next();
            System.out.print("Enter the tittle of book:");
            String tittle = scan.next();
            Books designOfSarrow = new Books(isbn, author, tittle);
            System.out.println("total no. of books in the library:" + getTotalNoOfBook());
            designOfSarrow.borrowBook();



        }

    }
}