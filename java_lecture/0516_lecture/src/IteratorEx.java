import java.util.*;
public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println("it: " + it);
			System.out.println(n);
			System.out.println("=================================");
		}
		
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum+=n;
		}
		System.out.println("The sum of the integers in a vector : " + sum);
		
		
	}

}
