//Write a function that takes in age as input and returns if that person is eligible to
//  vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
public class age {
    public static String age(int n){
        if(n>18){
            return "Person is eligible";

        }
        else{
            return "Person is not eligible";
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String n1=age(n);
        System.out.println(n1);
    }
    
}
