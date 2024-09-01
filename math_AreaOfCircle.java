import java.util.Scanner;

class math_AreaOfCircle {

    double radius;

     math_AreaOfCircle(double radius) {
         this.radius = radius;
     }

     double getCircumference(){
        return  2*radius*Math.PI;
    }

     double getArea(){
         return  Math.PI* Math.pow(radius,2);
     }

     @Override
     public String toString() {
         return "{  Circle props: radius:  " + radius  +
                 ", Circumference of circle: "+ getCircumference()+
                 " ,  Area of circle:  "+ getArea() +" }";
     }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Welcome to the world of Circle:");
         System.out.print("Enter the radius of circle in mm: ");
         int radius = sc.nextInt();
         math_AreaOfCircle C1 = new math_AreaOfCircle(radius);
         System.out.println(C1);
    }
}
