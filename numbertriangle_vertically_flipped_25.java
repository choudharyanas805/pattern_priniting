package pattern_printing;
import java.util.Scanner;

public class numbertriangle_vertically_flipped_25 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n = sc.nextInt();

        for(int i=1; i<=n;i++){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            int s=1;
            for (int a=1; a<=i;a++){

                    System.out.print(s);
                    s += 1;

            }
            System.out.println();
            // ss in gallery laptop.
        }


    }

}
