import java.util.Scanner;

public class break_inputExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome the exit loop");
        while( true) {
            System.out.print("Enter your command:");
            String command = sc.next();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("you have fully exited");
    }
}
