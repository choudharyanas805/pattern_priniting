package pattern_printing;

import java.util.Scanner;

public class starcross_part21 {
    static void main() {
        // print this is flouyd triangle not star cross
        /*
        1
        2 3
        4 5 6
        7 8 9 10
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a floyd triangle number = ");
        int n = sc.nextInt();
        int a=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();

        }
        /*
        in  this i =1 tha toh j =1 hua kyuki j is depend on i . so, a 1 bar print hua fir incre 2 value hogai a ki . ..
         */
    }
}
