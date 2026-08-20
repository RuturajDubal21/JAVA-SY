//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class sumoddnumber {
    public static int sum(int n){
        int total=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                total+=i;
            }
        }
        return total;
    }    
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter value of n:");
            int n=sc.nextInt();
            int odd=sum(n);
            System.out.println(odd);



        }
    
    
}
