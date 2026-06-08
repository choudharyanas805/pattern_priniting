package pattern_printing;

import java.util.Scanner;

public class number_triangle_part9 {
    static void main() {
        /*
        PRINT NUMBER TRIANGLE
        1
        12
        123
        1234 ..
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number= ");
        int row=sc.nextInt();

        for(int i=1; i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
