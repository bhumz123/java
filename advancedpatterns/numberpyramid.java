//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5



package advancedpatterns;

public class numberpyramid {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=1;i<=5;i++){
            // to print the spaces
            
            for(int j=1;j<=n-i;j++){
               System.out.print(" "); 
            }
            // to print the stars and the in between spaces
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
