// to update a bit
// 2nd bit , position = 1, n = 5, mkae 0
// to make 1
// operator or (set)
// to make 0
// and with not (clear)
// we need to take the input , what to make

package bitmanipulation;

import java.util.Scanner;

import advancedpatterns.solidrhombus;

public class update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        if(oper == 1){
            int bitMask = 1<<pos;
            int newnum = bitMask | n;
            System.out.println(newnum);
        }
        else{
            int bitmask = 1<<pos;
            int not =  ~(bitmask);
            int Newnum = not & n;
            System.out.println(Newnum);

        }


    }
    
}
