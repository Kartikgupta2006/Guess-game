public class toStringFormat {
    public static void main(String[] args) {
        String name = "Sandeep";
        int mark = 45242;
       // System.out.println("Hello" + name + "  , your marks are: " + mark);
        System.out.printf(" hello %-30S  , your mark is : %0,15d" , name,mark );

    }
}