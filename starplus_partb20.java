package pattern_printing;

public class starplus_partb20 {
    static void main() {
        /*

        print =
        ##*##
        ##*##
        *****
        ##*##
        ##*##

         */
        int row = 5;
        int col = 5;
        for(int i=1; i<=row; i++){
            for (int j= 1 ; j<=col; j++){
                if( i==3 || j==3){
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
