// relational operators
// == , != , > , < , >= , <=
// the output is always a boolean value , ie true or false

// logical operator
//  ||- and , && - or, ! - not( reverse the output of the statement)

package operators;

public class rltn {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 50;

        if (a >b || a>c ){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}
