import java.util.*;

public class functionavg{
    public static int avg(int a,int b,int c){
        return (a+b+c) / 3;
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of 1st number");
    int a=sc.nextInt();
    System.out.println("Enter value of 2nd number");
    int b=sc.nextInt();
    System.out.println("Enter value of 3rd number");
    int c=sc.nextInt();
    int result=avg(a, b, c);
    System.out.println(result);
    


}

}