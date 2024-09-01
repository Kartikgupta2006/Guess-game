 class RandomNumber {

    // Random number class which is subclass of main
     // class of project GuessingNumber Game

    public static int RandomNumber() {

        // Declare Static Method for return the Random Number
        // Which is integer type

       int Random;
       // Declare the Variable Random of integer type .

        Random = (int) Math.ceil(Math.random() * 100);
        // using the math Package to change the Random number in Integer type
        // firstly multiply by --  Random * 100
        // Second  using the method of math class which is ceil(),
        // And change the number in up order
        // then finally change the double value in integer type



        return Random;
        // Return the value of Random num
    }

}
