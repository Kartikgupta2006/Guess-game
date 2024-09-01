import java.util.Scanner;

public class minimumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int minimum ;
        if(num1<num2){
            minimum =num1;
        }else{
            minimum =num2;
        }
        System.out.println(minimum);
    }
}
