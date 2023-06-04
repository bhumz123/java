// declaration of a 2d array
// dtype [][] arrayname= new dtype[rows][columns]
// int [] [] numbers = new int [4] [9]
// here row 1 means row 0 
// indexing starts from 0 in java

package arrays;

public class twod {
    public static void main(String[] args) {
        int numbers[][]= new int[3][3];
        numbers[0][0]=45;
        numbers[0][1]=42;
        numbers[0][2]=41;
        numbers[1][0]=43;
        numbers[1][1]=35;
        numbers[1][2]=32;
        numbers[2][2]=31;
        numbers[2][0]=33;
        numbers[2][1]=25;
        // this loop is for rows
        for(int i=0;i<3;i++){
            // this loop is for columns
            for(int j=0;j<3;j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println("");
        }

    }
    
}
