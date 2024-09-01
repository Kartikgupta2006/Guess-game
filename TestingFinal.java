public class TestingFinal {
     public final double PI = 3.14;

     // final keyword uses for not change the value of when value should be declared
    //   final is a fix value not a change abel
      public void testoing(){
         double pi = PI;
          System.out.println(pi);
      }

    public static void main(String[] args) {
        TestingFinal sc = new TestingFinal();
        sc.testoing();
    }
}
