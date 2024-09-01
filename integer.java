
import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the num:");
        int num= sc.nextInt();
        int result;

        if(num>=0){
            result=num;
        }else{
            result=-num;
        }
        System.out.println(result);
    }
}
