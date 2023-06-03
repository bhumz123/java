//    *****
//   *****
//  *****
// *****
//*****
// we noticed that spaces are n-i
// and constant 5 stars are being printed
package advancedpatterns;

public class solidrhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            // for spaces
            int space = n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");

            }
            // printing of stars
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
