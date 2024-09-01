import java.util.Scanner;

class math_GuessingGame {
      int random;

      math_GuessingGame() {
        random = (int)Math.ceil(Math.random() * 100);


     }
     int guess(int guessnum){
          return  guessnum-random;

     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         math_GuessingGame game = new math_GuessingGame();
         System.out.println("Welcome to the guessing game . guess the number between 1 to 100:");
         int guessnum;
         int result;
         do {
             System.out.print("guess the num:");
              guessnum = sc.nextInt();
              result = game.guess(guessnum);
              if( result==0){
                  System.out.println("congrats , your guess is correct ");
              } else if (result<0)
              {
                  System.out.println("please guess higher ");
              }
              else
              {
                  System.out.println("please guess lower");
              }
         }while(result!=0);

     }

 }
