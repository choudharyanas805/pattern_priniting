package pattern_printing;

import java.util.Scanner;

public class hollow_rectangle_part19 {
    static void main() {
        //print given pattern: hollow rectangle
        /*
        *******   = j
        *#####*
        *#####*
        *#####*
        *******
        |
        i
         */
        /*
        if (first or last row  and first or last col){
               sout(*)}
        else{
          sout(#)}
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a nnumber:");
        int row= sc.nextInt();
        int col= sc.nextInt();

        for( int i=1; i<=row; i++){
            for (int j=1 ; j<=col;j++){
                if(i==1|| i==row || j==1 || j==col ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
