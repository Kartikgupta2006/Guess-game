 class ResultPrinting {

     //  ResultPrinting class which is subclass of main
     // class of project GuessingNumber Game

     public static int result(int result){

         // using nested if else condition in class result printing
        if( result==0){

            // result value is equal to 0 then this if statement will be executed
            System.out.println("congrats , your guess is correct ");
        } else if (result<0)
        {
            // result value is less then print this statement
            System.out.println("please guess higher ");
        }
        else
        {
            // no matching case then this statement will be executed
            System.out.println("please guess lower");
        }
        return result;
        // return the value of result
    }
}
