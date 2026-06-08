package pattern_printing;

public class odd__numbertriangle_23 {
    static void main() {
        // print
        /*
        1
        13
        135
        1357

         */
        int n = 4;
        for (int i = 1; i<=n;i++){
            int a=1;                // a koh row pai set . ismai a ki vakue 1 hi set rhaigi kyuki inside hai agr outside hota toh a change hota by 2 bar bar.
            for (int j=1; j<=i;j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}
