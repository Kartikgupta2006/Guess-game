public class Main {

    // main class of guessing game
    // which call all the sub Class
    // RandomNumber, GuessEnter, GuessNum, ResultPrinting classes

    public static void main(String[] args) {

        System.out.println("Welcome to the guessing game ." +
                           " guess the number between 1 to 100:");

        int Random = RandomNumber.RandomNumber();

        // call the inner method of which is RandomNumber of the class RandomNumber.


        int guessnum;
        // declare the integer variable for store the guessnum

        int result;
        // declare the integer variable for store the result of the program .

        do
        {
            guessnum = GuessEnter.GuessEnter();
            result = GuessNum.num(guessnum, Random);
            ResultPrinting.result(result);

        } while (result != 0);

        // using do while loop for single time running the program

    }

}
