package strings;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // string declaration
        String naem = "tony";
        String fullname = "tony sbhtark";
        String sentence = "my name is tony stark.";
        Scanner sc = new Scanner(System.in);
        // input a word
        //String sent= sc.next();
        
        String sentences = sc.nextLine();
       // System.out.println("your name is "+sent);

        // input a line
        System.out.println("the entire sentence is "+sentences);
    }
}
