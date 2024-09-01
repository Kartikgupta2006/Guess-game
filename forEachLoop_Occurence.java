

import java.util.Scanner;

public class forEachLoop_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.print("enter the array:");
        for(int i=0; i<=5 ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the that you want to Search:");
        int element = sc.nextInt();
        int No = countOccurence(arr, element);
        System.out.println(element + " element is occur in " + No + " times");
    }
    public static int countOccurence(int[] arr, int element){
        int occ=0;
       for(int num: arr){
           if (num ==element){
               occ++;
           }

        }
        return occ;
    }
}
