// we know that strings are immutable
// data stored in stack or heap memory


package stringbuilder;


public class build {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
        // char at 0
        System.out.println(sb.charAt(0));

        // set char 
        sb.setCharAt(0,'b');
        System.out.println(sb);

        // insert a character at a particular index
        sb.insert(2,'f');
        System.out.println(sb);

        // delete a character
        sb.delete(1, 3);
        System.out.println(sb);

        
    }
}
