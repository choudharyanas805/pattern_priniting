package pattern_printing;

public class hw_pat17 {
    static void main() {
        // print the alphabet triangle horizontally flipped.
        /*
        a b c d
        a b c
        a b
        a
         */
        int n=4;
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n+1-i;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
