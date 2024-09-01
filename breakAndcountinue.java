public class breakAndcountinue {
    public static void main(String[] args) {
        System.out.println("before loop");
        for ( int i=0; i<=100; i++){
            // in case of continue skip one codition alteration
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("out of loop");
    }
}
