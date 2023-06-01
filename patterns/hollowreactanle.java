package patterns;

public class hollowreactanle {
    public static void main(String[] args) {
        
    
    int m=5;
    int k=4;
    int i=1;
    int j=1;

    for( i=1;i<=k;i++){
        
            for( j=1;j<=m;j++){
                
                    if(i==1 || j==1 || i==k || j==m){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                 
            }
            System.out.println("");
            
        }
        
        

    }}


// in this we will write them in matrix form 
// then find their connection
// the values have i=1 or n
// or j=1 or k
// *****
// *   *
// *   *
// *****
