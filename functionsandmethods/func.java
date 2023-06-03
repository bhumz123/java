// functions must have a return type
// first we have to define the dtype
// then we define the funcname , it shouldn't be a java keyword
// then comes the arguments, first its dtype then the argument
// multiple arguments can be given
// void means no return type


package functionsandmethods;

import java.util.Scanner;

public class func {
    public static void printMyName(String name){
        System.out.print("my name is "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        printMyName(name);
        
    }
}
