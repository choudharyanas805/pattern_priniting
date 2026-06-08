package pattern_printing;

public class star_triangle_part8 {
    static void main() {
        /*
        wap triangle
        *
        **
        ***
        ****
         */
        int row=3;
        for (int i=1; i<=row;i++){   // i sirf row kai hisab sai chaliga mean j dependent hai i ka
            for (int j=1;j<=i;j++){  // restriction dai di hai i loop jitna chalaiga uthna j chaliga mean * execute hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
