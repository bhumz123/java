package patterns;

public class invertedhalfpyramid {
    public static void main(String[] args) {
        int i=1;
        int n=4;
        int m=4;
        for(i=1;i<=n;i++){
            for(int j=m;j>=1;j--){
                System.out.print("*");
                

            }
            m=m-1;
            System.out.println(" ");
        }
    }
}

// ****
// ***
// **
// *
