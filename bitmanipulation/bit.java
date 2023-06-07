// used to reduce the time complexity
// in the left shift opertor , the binary number shifts to left side , n number of times
// in the   right shift opertor , the binary number shifts to right side , n number of times
// get bit , set bit , update bit , clear bit
// positions are calculated right to left
// to get the third bit(position = 2) of a number n = 0101
// steps
// perform a bit mask( manipulation of numbers)
// use of and operator
// how to calculate a bit mask
// first write the binary of 1
// shift the binary to left side by the position number of times
// you obtain the bit mask
// then check the bit mask obtained with the given number n
// if the final output has all 0s then the bit is 0
// else the bit is 1
// in order to get the bit we use & operator
// ques ) 3rd bit , position 2 , number n= 0101



package bitmanipulation;

public class bit {
    public static void main(String[] args) {
        
    
    int n = 5;
    int pos = 2;
    int bitMask = 1<<pos;
    if ((bitMask & n)== 0){
        System.out.println("bit was 0");
    }
    else{
        System.out.println("bit was 1");
    }

    }
    
}
