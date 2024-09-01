import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of 1 to 7 :");
        int day = sc.nextInt();
      //  switch (day){
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//            default:
//                System.out.println("wrong choice");
//
//        }
            String daystr = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "invalid";

        };
        System.out.println(daystr);
    }
}
