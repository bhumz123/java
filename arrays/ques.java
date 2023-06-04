// define a user input array , find a number , and print its index

package arrays;

import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        
    // defining the user input class
    Scanner sc = new Scanner(System.in);
    // size
    System.out.println("enter the array size");
    int size= sc.nextInt();
    // number to find
    System.out.println("enter the number to find ");
    int findnum= sc.nextInt();
    int numbers[]= new int[size];
    System.out.println("now enter the elements in array");
    for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
    }
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]==findnum){
            System.out.println("number found");
            System.out.print("number is at index : "+i+"\n");
            break;
        }
        

    }
    

}}