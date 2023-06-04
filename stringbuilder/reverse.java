package stringbuilder;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("hello");
        for(int i=0;i<name.length()/2;i++){
            // indexing for swaping
            int front = i;
            int back = name.length()-1-i;
            // char at respective places
            char frontchar = name.charAt(front);
            char backchar = name.charAt(back);
            // setting up of characters
            name.setCharAt(front, backchar);
            name.setCharAt(back, frontchar);



        }
        System.out.println(name);
    }
}
