import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        System.out.println("Welcome to recursive method ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num to find the factorial:");
        int num = sc.nextInt();
        int fact=factorial(num);
        System.out.println("factorial of num is: " + fact);
    }
    public static int  factorial(int num){
        System.out.println("function call for"+ num);
        if ( num == 1 ) {
          return 1;
        }
       return num* factorial(num-1 );
    }
}
