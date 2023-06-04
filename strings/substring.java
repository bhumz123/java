// substring
// substring(beg index , end index)




package strings;

public class substring {
    public static void main(String[] args) {
        String sentence = "my name is tony";
        String name = sentence.substring(11,sentence.length() );
        System.out.println(sentence);
        System.out.println(name);
    }
}
