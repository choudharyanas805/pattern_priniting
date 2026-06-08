package pattern_printing;

public class hw_part12 {
    static void main() {
        // print
        /*

        A
        AB
        ABC ..
         */
        int row = 4;
        for(int i=1;i<=row;i++){
            for (int j=1; j<=i;j++){

                System.out.print((char)(j+64)+" ");
            }

            System.out.println();
        }
    }
}
