package strings;

public class cncat {
    public static void main(String[] args) {
        String name = "rohit";
        String second = "sharma";
        // concat
        String full = name+ " @ "+ second;
        System.out.println(full);
        // to get the length of the string
        System.out.println(full.length());

        // charAt
        // print all letter in the string
        for(int i=0;i<full.length();i++){
            System.out.println(full.charAt(i));
        }
    }
}
