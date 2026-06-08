package pattern_printing;

import java.util.Scanner;

public class star_triangle_rev_part14A {
    static void main() {
        //print the pattern- star triangle horizontally flipped.
        /*1234 -> j
        1 ****
        2 ***
        3 **
        4 *
        |
        i
         abhi tk hm rectangle,square, triangle dekh chukai hai ab reverse triangle ki baraari hai..
         */
        /*
        i=1 , j=1,2,3,4
        i=2 , j=1,2,3
        i=3,  j=1,2
        i=4 , j=1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number =");
        int n= sc.nextInt();
     //   for (int i=1; i<=n;i++){

      //      for (int j=n;j>=i;j--){
      //          System.out.print(j);// this is my concpet not sir thike.
      //      }
      //      System.out.println();
      //  }
       // or both are best concept.
        for (int i=1;i<=n;i++){
            for (int j=1; j<=n-i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // differece is in number print mai .so j>=i mai * ki jah j print karaigai tb number print hoga
        /*
        yh print hoga
        54321
        5432
        543
        54
        5
         */
        // agr j<=n-i+1  print j jissai no. print ho
        /*
        print
        12345
        1234
        123
        12
        1
         */

       // laptop screenshot mai hai whole printing pattern concept.


        // start at 1.15.00 yt video start
    }
}
