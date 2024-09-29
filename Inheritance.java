package Practice;

class A{
   int a=5;
   void A(){
       System.out.println("hello");
   }
}
class B extends A{
    int a=8;
    void B(){
        System.out.println("bye");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.A();

    }
}


