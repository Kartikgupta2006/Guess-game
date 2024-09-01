import java.util.Scanner;

class dowhile_noGuessingGame {

    public static void main(String[] args) {
        int num= 5, guess;
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to no guessing game ");
        do {
            System.out.print("please guess the num between 0 to 9:");
            guess = sc.nextInt();

        }while(num != guess);
        System.out.println("you have sucess to the num");
    }
}
