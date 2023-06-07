// clear 3rd bit , position = 2 , number n = 0101
// operation used is and with not 
package bitmanipulation;

public class clearbit {
    public static void main(String[] args) {
        
    
    int n =5;
    int pos = 2;
    int bitMask = 1<<pos; // gives 0001 , 1
    int not = ~(bitMask);
    int newnum = not & n;
    System.out.println(newnum);

    } 
}
