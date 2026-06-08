package pattern_printing;

import java.util.Arrays;
import java.util.Scanner;

public class alphabet_square_part4 {
    static void main() {
        // wap to print alphabet square
        /*
        A B C D
        A B C D
        A B C D
        A B C D
         */
        /*
        1 2 3 4
        1 2 3 4
        1 2 3 4 easily print kr sktai ho

        65 66 67 68
        65 66 67 68
        65 66 67 68  yh bhi eailty print j loop mai j+64 but ab type cast kro char(j+64) agya answer.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n= sc.nextInt();

        for(int i=1; i<=n;i++){
            for (char j =1 ; j<=n; j++){
                System.out.print((char)(j+64)+" ");  //type cast krdiya beocz A=65 , B=66 ....
            }
            System.out.println();
        }
    }
}
