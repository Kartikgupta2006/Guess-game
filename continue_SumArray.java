import java.util.Scanner;

public class continue_SumArray {
    public static void main(String[] args) {
        System.out.println("welcome the sum of Array");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr =new int[size];
        for(int i=0; i<size ; i++){
            System.out.print("enter the  " + ( i+1)+ " element od array:");
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int num: arr){
            if(num<0){
                continue;
            }
            sum+= num;
        }
        System.out.println("the sum of positive num is: " + sum);
    }
}
