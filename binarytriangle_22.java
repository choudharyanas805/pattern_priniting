package pattern_printing;

import java.util.Scanner;

public class binarytriangle_22 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter a number = ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i;j++){
                int a= i+j;
                if (i==j || a%2==0){   // do not required to write i==j kyuki 1 = even pai and 0== odd pi.
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
            // if((i+j)%2==0) yh bhi shi hai
        }
    }
}
