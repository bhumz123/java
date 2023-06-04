// format to describe an array
// dtype[] arrayname= new dtype[size];
// new- keyword, to allocate space in memory
// continuous memory locations
// indexing starts from 0


package arrays;

public class arr {
    public static void main(String[] args) {
        // creating an array
        int [] marks = new int[5];
        // inserting values
        marks[0]=90;
        marks[1]=89;
        marks[2]=67;
        marks[3]=94;
        marks[4]=97;
        // printing all the marks
        for(int i=0;i<=4;i++){
            System.out.println(marks[i]);
        }

    // when the size of an array is already known
    int markss[]={78,90,90,89,99,98,97,96};
    // to know the length of the array
    for(int i=0;i<markss.length;i++){
        System.out.println(markss[i]);
    }
    }
    
}
