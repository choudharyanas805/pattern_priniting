package pattern_printing;

import java.util.Scanner;

public class number_square_part3 {
    static void main() {
        // wap to print number square
        /*
        1 2 3 4
        1 2 3 4
        1 2 3 4
        1 2 3 4
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n= sc.nextInt();

        for(int i=1; i<=n;i++){
            for (int j=1; j<=n;j++){
                System.out.print(j+" ");
            }                             // best for square concept
            System.out.println();
        }

    }
}
