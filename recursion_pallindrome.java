import java.util.Scanner;

public class recursion_pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name checked id pallindrome or not:");
        String name = sc.next();
       boolean yes=  pallindrome(name);
        System.out.println("name is pallidrome " + " : " + yes);

    }
    public static boolean pallindrome(String name){
        if (name.length() <= 1){
            return true;
        }
        int lastpos = name.length() - 1;
        if(name.charAt(0) != name.charAt(lastpos)){
            return false;
        }
        String newname = name.substring(1,lastpos);
            return pallindrome(newname);
    }
}
