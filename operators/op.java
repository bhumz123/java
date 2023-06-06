// symbols that tell compiler to perfom some operation
// operation is performed on two operators
// we have different types of operators
// binary: + , - , * , / , %- gives remainder
// unary ++ , --
// pre increment - ++a, first change value then use
// post increment - a++, first use value then change
// same for decrement

package operators;

import javax.sound.sampled.SourceDataLine;

public class op {
    public static void main(String[] args) {
        
    
    // post increement
    // value assign then change
    int a = 10;
    int b=0;
    b=a++;
    System.out.println(a); // gives 11
    System.out.println(b); // gives

    // pre increment
    // value change then assign
    int c = 10;
    int d = 0;
    d = ++c;
    System.out.println(c); // gives 11
    System.out.println(d); // gives 11

    }
    
}
