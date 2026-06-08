package pattern_printing;

public class double_flipped_27 {
    static void main() {
        int n=4;

        for (int i =1; i<=n;i++){

            for (int j=1; j<=i;j++){
                System.out.print(" ");
            }
            for (int a=1; a<=n+1-i;a++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
