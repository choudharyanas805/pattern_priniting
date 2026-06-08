package pattern_printing;

public class hw_part11 {
    static void main() {
        // print
        /*

        A
        BB
        CCC ..
         */
        int row = 4;
        for(int i=1;i<=row;i++){
            for (int j=1; j<=i;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
