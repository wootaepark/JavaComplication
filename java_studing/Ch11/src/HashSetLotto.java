import java.util.*;
public class HashSetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;set.size() < 6; i++) {
			int num = (int)(Math.random()*45) +1;
			set.add(new Integer(num));
			
		}
		List<Integer> list = new LinkedList<>(set);
		//Collections.sort(list); // collection 정렬 코드
		System.out.println(list);
		
		

	}

}
