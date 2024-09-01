import java.util.Scanner;

class dowhile_PasswordCheckerValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to set your password \n");
        String password;
        do{
            System.out.println("Enter your password");
            password = sc.next();
        }while (!isValidPassword(password));
        System.out.println("thanks it is  the valid password");



    }
    public static boolean isValidPassword(String password){
       return password.length()>=6;
    }
}
