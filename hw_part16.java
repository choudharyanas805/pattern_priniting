package pattern_printing;

public class hw_part16 {
    static void main() {
        /*
        hw
        1234
        123
        12
        1
         */
        // number triangle horizontrally flipped.
        int n=4;
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // print 4321
        //       432
        //       43
        //       4
        /*
        int n=1;
        for(int i=1; i<=n;i++){
          for(int j=1; j>=i;j--){
               sout(j+" ");
               }
               sout()}
         */
    }
}
