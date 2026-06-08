package pattern_printing;

import java.util.Scanner;

public class star_rectangle_basic {
    static void main() {
        /*
        print the pattern
        * * * * *
        * * * * *
        * * * * *
         */

      //  System.out.println("* * * * *");
      //  System.out.println("* * * * *");   this is bewakyufi
      //  System.out.println("* * * * *");

        // 3 row and 5 column;

        // nested loop seekhaigai ismai hum

      //  for (int i=1; i<=3; i++){
      //      System.out.println("* * * * *");  upper walai sai thoda better.
      //  }

        Scanner sc = new Scanner(System.in);
        System.out.print("enter ROW =");
        int row = sc.nextInt();

        System.out.print("enter COLUMN =");
        int column = sc.nextInt();

        // agr ln nhi lagya toh same line mai all print..
            // yh row wise hoga next line mai

        for(int i=1; i<=row ; i++){
               for (int j = 1; j <= column; j++) {
                        System.out.print("* "); // print ki kitnai * star hogai ak line mai
               }
        System.out.println();
        }

        // notepad mai dry run
    }
}
