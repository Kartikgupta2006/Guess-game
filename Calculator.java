import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("------------------------Welcome to Calculator in JAVA ---------------------");
        System.out.println("Enter the  num which you choice");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.print("Enter the choice");
        int choice = sc.nextInt();
        System.out.print("Enter the first num:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second num:");
        int num2 = sc.nextInt();
            switch (choice) {
                case 1:
                    Addition(num1, num2);
                    break;
                case 2:
                    Subtraction(num1, num2);
                    break;
                case 3:
                    Multiplication(num1, num2);
                    break;
                case 4:
                    Division(num1, num2);
                    break;
                default:
                    System.out.println("wrong choice");
                    break;
            }

    }
    public static void Addition(int num1, int num2){
        int result = num1+num2;
        System.out.println("the sum of both number" + result);
    }
    public static void Subtraction(int num1, int num2){
        int Subtraction= num1-num2;
        System.out.println("the subtraction  of both number" + Subtraction);
    }
    public static void Multiplication(int num1, int num2){
        int Multiplication = num1*num2;
        System.out.println("the Multiplication of both number" + Multiplication);
    }
    public static void Division(int num1, int num2){
        if(num1>num2){
           int  Division= num1/num2;
            System.out.println("the DIVISION of both number" + Division);
        }else{
            System.out.println(" num1 is smaller then num2 please enter the value grater");
        }


    }
}
