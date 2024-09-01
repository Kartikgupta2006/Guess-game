 import java.util.*;

public class interest {
 
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       System.out.println("Enter the value of principal: ");
       double principal = scan.nextDouble();
       System.out.println("Enter the value of rate: ");
       double rate = scan.nextDouble();
       System.out.println("Enter the value of time period: ");
       int time = scan.nextInt();
       double Time=(int)time;
       double s;
        s= (principal*rate*Time)/100;
        System.out.println("simple interest:" + s);
    };
};
