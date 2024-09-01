import java.util.Scanner;

public class SchoolResult {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number  of Student obtain in Exam:");
        int num= sc.nextInt();
        if(num> 90){
            System.out.println(" Grade A");
        }else if(num<90&&num>70){
            System.out.println("Grade B");
        }else{
            System.out.println("Grade C");
        }
    }
}
