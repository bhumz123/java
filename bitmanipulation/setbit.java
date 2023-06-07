// set the 2nd bit, position = 1; number n = 0101
// in order to set the bit we use or (|| operator

package bitmanipulation;

public class setbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int newnum = bitMask | n;
        System.out.println(newnum);
    }
    
}
