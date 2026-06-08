package pattern_printing;

import java.util.Scanner;

public class starplus_part20 {
    static void main() {
        // print star plius pattern
        /*
           *
           *
       * * * * *
           *
           *
            i=3
            j=3 pai print
            * you can imagine this
        ##*##
        ##*##
        *****
        ##*##
        ##*##
        this is square .
         */

        int row=5;
        int col=5;
        for( int i=1; i<=row; i++){
            for (int j=1 ; j<=col;j++){
                if(i==3 || j==3  ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");  // two bar space.
                }
            }
            System.out.println();
        }
        // start 1.30.33 sai
        /*
        ##*##
        ##*##
        *****
        ##*##
        ##*##
        print in next part 21
         */
    }
}
