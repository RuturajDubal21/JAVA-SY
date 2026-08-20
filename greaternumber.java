//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class greaternumber {
    public static int greater(int a,int b){
        if (a<b) {
            return b;
            }
            else{
                return a;
            }
            
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int great=greater(a, b);


        System.out.println(great);
    }    
    
}
