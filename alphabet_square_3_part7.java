package pattern_printing;

import java.util.Scanner;

public class alphabet_square_3_part7 {
    static void main() {
        // wap number squarw 2
        /*
        A A A A
        B B B B
        C C C C
        D D D D
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n= sc.nextInt();

        for(int i=1; i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 65) +" ");// imp concept yh hai  i print

            }
            System.out.println(" ");
        }
    }
}
