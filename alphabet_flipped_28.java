package pattern_printing;

public class alphabet_flipped_28 {
    static void main() {
        int n=4;

         for(int i=1; i<=n;i++){
             for(int j=1; j<=n-i; j++){
                 System.out.print(" ");
             }
             for (char a=1 ; a<=i;a++){
                 System.out.print((char)(i+64));
             }
             System.out.println();
         }
    }
}
