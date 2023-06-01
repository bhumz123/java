package conditionalstatements;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        // creating object to user input age
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        //condition to check whether the number is even 
        if(number%2==0){
            System.out.println("number is even");

        }
        else{
            System.out.println("number is odd");
        }

    }
}
