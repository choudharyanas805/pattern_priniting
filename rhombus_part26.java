package pattern_printing;

public class rhombus_part26 {
    static void main() {
        int n=4;

        for (int i=1; i<=n;i++){
            for (int j=1; j<=n-i;j++){
                System.out.print("  ");  // 4 sai size reduction 3 - 2 -1 -0
            }
            for (int a=1; a<=n; a++){
                System.out.print("* "); // square hai and upoper or lower both add
            }
            System.out.println();
        }
        // achai sai smjk=he go for picture in laptop gallery
    }
}
