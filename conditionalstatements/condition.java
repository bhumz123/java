package conditionalstatements;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        // to user input the age
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        // condition checking
        // they work in boolean expressionn
        // if true then execute if ptherwise false
        if(age>=18){
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you arent elegible to vote");
        }
    }
    
}
