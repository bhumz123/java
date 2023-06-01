package loops;

import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
        // to store the value of sum
        int sum = 0;
        // user input upto which you need the sum
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number upto which you want the sum");
        int n=sc.nextInt();
        // looping till n numbers
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("the sum of n natural numbers is: "+ sum);
    }
}
