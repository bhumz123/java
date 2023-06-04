// user input 2d array , then find the integer, and print its index

package arrays;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // no of rows in 2d array
        System.out.println("enter no of rows ");
        int rows= sc.nextInt();
        // no of columns in 2d array
        System.out.println("enter no of columns ");
        int columns=sc.nextInt();
        // number to find
        System.out.println("enter no to find");
        int number=sc.nextInt();
        int num[][]= new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                num[i][j]= sc.nextInt();
                
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(num[i][j]==number){
        
                    System.out.println( "[ " + i +" "+j+"]"+" is the index ");
                    break;
                }
                
            }
        }
    }
}
