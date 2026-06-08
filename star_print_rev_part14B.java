package pattern_printing;

import java.util.Scanner;

public class star_print_rev_part14B {
    static void main() {
        // print start reverse ka best concept another
        /*
        ****
        ***
        **
        *
         same as for 1234 .. or abcd ..
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int a = n; //  no of stars to be printed in each line

        for (int i=1; i<=n;i++){   // row toh correct print hogi
            for (int j=1; j<=a;j++){ // column mai rectangle print hoga kyuki a const agr print reverse star toh a-- krdo out of loop
                System.out.print("* ");
            }
            //a--; // a constant nhi rhai minus hota chala jaiga toh rev star print. comment off krlio
            System.out.println(); // or a-- j loop kai bhr jissai agli bar chnages ho or tri print ho .
        }

    }
}
