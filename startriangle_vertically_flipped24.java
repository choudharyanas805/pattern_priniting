package pattern_printing;

public class startriangle_vertically_flipped24 {
    static void main() {
        //
        /*

         */
        int n=4;
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){// n+1-i krkai last row mai # aiga
                System.out.print("   ");  // ismai # laga io thoda concept clear hojaiga
            } // #jab hash dekhaiga toh last row mai 1 no pai hash hai toh yh nhi hona chgaiyai toh use n-i only
            for(int z=1; z<=i;z++){  // n+1-i islie use kyuki ham ulta triangle use krrhai thai jissai last mai ai value but in thus scenrio no need to do last value so use n-i only .
                System.out.print("* ");
            }
            System.out.println();
        }
        // second method was
        /*
        for(int i =1;i<=n;i++){
             for (int j=1; j<=i;j++){
                 if((i+j)<n sout(*);
                 else sout(" ");
                 }
                 both work same but 1 method was efficient
       IMPORTANT ALERT = picture in gallery check
         */
    }
}
