// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

// butterfly pattern


package advancedpatterns;

public class one {
    public static void main(String[] args) {
        int n=4;
        // this loop is for number of rows
        for(int i=1;i<=4;i++){
            /// this loop is initiated for 1st half of star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // this loop is for stars
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
                
            }
            // this loop is for 2nd half of star

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        // same for the second part
        // but now we will reverse the values

        // for rows

        for(int i=4;i>=1;i--){
            // to print the stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // to print the spaces
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            // to print the second half of stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
            
        }

    }
     
}
