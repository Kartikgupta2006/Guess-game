import java.util.Scanner;

class forEach_maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        for( int i =0; i<5; i++){
            System.out.print("Enter the "+ (i +1)+ "number of array:");
            arr[i]= sc.nextInt();
        }
        int max= Integer.MIN_VALUE;
        for( int num: arr){
            if(max<num){
                max= num;
            }
        }
        System.out.println("maximum num is: " + max );
    }

}
