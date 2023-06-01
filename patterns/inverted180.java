package patterns;

public class inverted180 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int n=4;
        for(i =1;i<=n;i++ ){
            for(i=j;j<=n-1;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
//    *
//   **
//  ***
// ****
// in this we have used 2 inner loops
// first one to print the spaces
// second one to print the stars
