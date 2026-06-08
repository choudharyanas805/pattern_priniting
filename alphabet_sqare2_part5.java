package pattern_printing;

import java.util.Scanner;

public class alphabet_sqare2_part5 {
    static void main() {
        // wap print  alphabet square 2
        /*
        a b c d
        a b c d
        a b c d
        a b c d
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n= sc.nextInt();

        for(int i=1; i<=n;i++){
            for (char j =1 ; j<=n; j++){
                System.out.print((char)(j+96)+" ");  //type cast krdiya beocz a=97 , b=98 ....
            }                                 // or j=97 sai bhi start kr sktai ho direct imp point
            System.out.println();
        }
    }
}
