package functionsandmethods;

import java.util.Scanner;

public class fact {
    public static int fact(int n){
        if(n<0){
            System.out.println("invalid number");
        }
        int num=1;
        for(int i=1;i<=n;i++){
            num=num*i;

        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = fact (n);
        System.out.print("factorial is "+ num);
    }
}
