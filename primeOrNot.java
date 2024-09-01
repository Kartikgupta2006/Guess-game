import java.util.Scanner;

class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num :");
        int num = sc.nextInt();
        boolean isprime = isprime(num);
        System.out.println("your num is prime : " + isprime);

    }
    public static boolean isprime(int num){
        for (int i =2; i< num ;i++){
            if (num %i==0){
                return false;
            }
        }

        return true;
    }
}
