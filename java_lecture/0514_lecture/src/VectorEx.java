import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = new Vector<>(); // default capacity = 10;
		//Iterator<Integer> it = (Iterator<Integer>) v;
		
		 v.add(5);
		 v.add(4);
		 v.add(-1);
		 
		 v.add(2,100);
		 
		 System.out.println("The number of element objects in the vector : " + v.size());
		 System.out.println("The current capacity of the vector : " + v.capacity());
		 
		 for(int i = 0; i<v.size();i++) {
			 int n = v.get(i);
			 System.out.println(n);
		 }
		// int sums = v.get(0);
		

		 int sum = 0;
		 for(int i=0; i<v.size() ;i++) {
			 int n = v.elementAt(i);
			 sum +=n;
		 }
		 System.out.println("The sum of the integers in a vector : " + sum);
	}

}
