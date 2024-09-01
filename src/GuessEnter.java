import java.util.Scanner;

// import the package ofScanner file for   input

class GuessEnter {

    // GuessEnter class which is subclass of main
    // class of project GuessingNumber Game

   public static int GuessEnter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("guess the num:");

        // print the Guess the num: in terminal


        int guessnum = sc.nextInt();
        // Enter the Variable in terminal in  Runtime program

        return guessnum;

       // Return the value of guessnum
    }
}
