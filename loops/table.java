package loops;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // creating object for user input
        System.out.println("enter the number whose table you want to print");
        int s=1;
        int number =sc.nextInt();
        for(int i=1;i<=10;i++){
            // to store the value
            s=number*i;
            // to print the table
            System.out.println(number+" X "+ i+" = "+ s);
        }

    }
}
