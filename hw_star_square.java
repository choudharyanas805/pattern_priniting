package pattern_printing;

import java.util.Scanner;

public class hw_star_square {
    static void main() {
        // print given star square pattern
        /*
        * * * *
        * * * *
        * * * *
        * * * *
         */
        //int row = 4;
        //int col= 4;

        //for (int i=1;i<=row;i++){
        //    for (int j=1; j<=col;j++){
        //        System.out.print("* ");
        //    }
        //    System.out.println();  // next line
        //}

        //OR  issai  etter square row or col same
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1; i<=n;i++){
            for (int j=1; j<=n;j++){
                System.out.print("* ");
            }                             // best for square concept
            System.out.println();
        }

    }
}
