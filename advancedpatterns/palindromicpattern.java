//     1
//    212
//   32121
//  4321234
// 543212345

package advancedpatterns;

public class palindromicpattern {
    public static void main(String[] args) {
        // for the execution of loops
        for(int i=1;i<=5;i++){
            // for the spaces
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            // for the first half of numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //again for second half of numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
