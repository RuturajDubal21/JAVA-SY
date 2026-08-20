//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class circumference {
    public static double circumference(double r){
        double c=2*Math.PI*r;
        return c;
    }

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            double r=sc.nextDouble();
            double circum=circumference(r);
            System.out.println(circum);

        }
    
    
}
