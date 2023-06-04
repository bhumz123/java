// compare to 
// this function is used to compare the string1 with respect to string2
// this compare to function checks 3 cases
// s1>s2, gives psoitive value
// s1=s2, gives 0
// s1<s2, gives negative value
// here the comparison in terms of character values

package strings;


public class compare {
    public static void main(String[] args) {
        String name1 = "bhumika";
        String name2 = "devansh";
        if (name1.compareTo(name2)==0){
            System.out.println("strings equla");
        }
        else{
            System.out.println("strings are not equal");
        }


    }
}
