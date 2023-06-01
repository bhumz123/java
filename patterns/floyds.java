package patterns;

public class floyds {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+ "  ");
                k=k+1;

            }
            System.out.println("");
        }
    }
}

// 1
// 2  3
// 4  5  6
// 7  8  9 10
//11 12 13 14 15
// here i and j are for the iterations of the loop
// to know how many times the loop will work
// we have used k, number to be printed

