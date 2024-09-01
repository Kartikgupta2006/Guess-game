import java.util.*;

public class Book {
    public static void main(String[] args) {
        int Total=0;
        int  detail=0;
        Scanner sc= new Scanner(System.in);

        System.out.println("---------------Welcome in the library----------------");
        System.out.println("1. Store the detail of book in library .");
        System.out.println("2. Borrow the Book .");
        System.out.println("3. Book is available in library .");
        System.out.println("4. Total no. of book present in library .");
        System.out.println("5. Return the book .");
        System.out.println("6. Total book present in library .");
        System.out.println("7. Search the book Present in library .");
        System.out.println("8. Exit to library .");
        while(true){
            System.out.print("\n*******Enter your choice:");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                {
                 Total =  Detail.detail(Total);
                  break;
                }
                case 2:
                {
                 Borrow.borrow(Total);
                   break;
                }
                case 3:
                {

                }
                case 4:
                {
                    TotalNoOfBook.Total(Total);
                    break;
                }
                case 5:
                {

                }
                case 6:
                {

                }
                case 7:
                {
                    Search.search(Total);
                }
                case 8:
                {

                }
                default:
                {
                    System.out.println("Wrong choice please enter the correct choice");
                }


            }
        }
    }
}
