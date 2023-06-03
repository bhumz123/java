package functionsandmethods;

import java.util.Scanner;

public class add2 {
    public static int add(int a , int b){
        int sum=a+b;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.print("sum of 2 numbers is "+ sum);
    }
}
