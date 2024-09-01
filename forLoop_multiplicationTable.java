import java.util.Scanner;

public class forLoop_multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num which you have print the table:");
        int num = sc.nextInt();
        System.out.println("the table of" + num + " is");
        for( int i =1; i<=10; i++){

            System.out.println(i +"*"+ num + "="  + num*i );
        }
    }
}
