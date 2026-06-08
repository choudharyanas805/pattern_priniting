package pattern_printing;

public class hw_part13_alphanumeric {
    static void main() {
        // print the given pattern
        /*
        1
        AB
        123
        ABCD
        12345
         */
        int n = 4;

        for (int i = 1; i <= n; i++) {
            // i pai depend hai i=n toh agr n=4
            // toh i=1 odd numeric print fir i=2 odd alphabet print
            // even row -> aplhabet
            if (i % 2 == 0) {
                char ch='A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch);
                    ch++;
                }
            }
            // odd rows -> number or numeric
            else{
                for (int j=1; j<=i;j++){
                    System.out.print(j);
                }
            }
            System.out.println();

        }
    }
}



