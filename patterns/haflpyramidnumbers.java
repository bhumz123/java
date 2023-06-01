package patterns;

public class haflpyramidnumbers {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}

// for this we will use the inner loop 
// inner loop is related to row number
// then use this logic with numbers
// 1
// 12
// 123
// 1234
// 12345