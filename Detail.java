import com.sun.source.tree.BreakTree;

import java.util.*;

public class Detail {

    public static int detail(int Total){
          int count=0;
          Scanner sc = new Scanner(System.in);
        int[][] Sno = new int[1][1];
        System.out.println("-----------Enter the all detail about book------------");
        for(int i=0; i<1 ; i++){

            for(int j=0;j<1;j++){

                System.out.print("Enter the Sno book:");
                String  sno= sc.next();
                System.out.print("Enter the author of book:");
                String Author = sc.next();
                System.out.print("enter the Tittle of book:");
                String Tittle = sc.next();
                Total++;
            }

        }

        return Total;


    }

}
