import java.util.*;

public class arraylis {
	public static void main(String[] args) {

	ArrayList<Integer>arr=new ArrayList<>();
	arr.add(10);	
	arr.add(20);
	arr.add(30);
	arr.add(40);
	arr.add(5);
	arr.add(35);
	arr.set(0, 100);
	System.out.println(arr);
	int value=arr.get(1);
	System.out.println(value);
	arr.set(1, 25);
	System.out.println(arr);
	arr.remove(1);
	System.out.println(arr);
	arr.remove(Integer.valueOf(30));
	System.out.println(arr);
	System.out.println(arr.size());
	System.out.println(arr.contains(40));
	System.out.println(arr.indexOf(40));
	System.out.println(arr.isEmpty());
	for(Integer x:arr) {
		System.out.println(x);
	}
	Collections.sort(arr);
    System.out.println("Ascending order: " + arr);	

	
	}

}
