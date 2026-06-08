package pattern_printing;

import java.util.Scanner;

public class number_square2_part6 {
    static void main() {
        // abhi tk square = star, number j likh diya, fir aplhabet tye cast kra and 65 add , again typecast add 96 .
        // wap number squarw 2
        /*
        1 1 1 1
        2 2 2 2
        3 3 3 3
        4 4 4 4
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n= sc.nextInt();

        for(int i=1; i<=n;i++){
            for (int j=1; j<=n;j++){
                System.out.print(i+" ");  // imp concept yh hai  i print

            }
            System.out.println(" ");
   /*
     1 2 3 4=j
   1 1 2 3 4     hm i sirf const. and only for line change
   2 1 2 3 4     but agr hm j const and i print karai . it is beneficial
   3 1 2 3 4     j karaiga row wl kaam and i karaiga col. wla kaam
   4 1 2 3 4
   |
   i */
        }

    }
}
