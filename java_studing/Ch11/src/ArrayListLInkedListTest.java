import java.util.*;
public class ArrayListLInkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(2000000);
		LinkedList ll  = new LinkedList();
		
		System.out.println("= 순차 추가 =");
		System.out.println("ArrayList : " + add1(al));
		System.out.println("LinkedList : " + add1(ll));
		System.out.println();
		
		System.out.println("= 중간 추가 =");
		System.out.println("ArrayList : " + add2(al));
		System.out.println("LinkedList : " + add2(ll));
		System.out.println();
		
		System.out.println("= 중간 삭제 =");
		System.out.println("ArrayList : " + remove2(al));
		System.out.println("LinkedList : " + remove2(ll));
		System.out.println();
		
		System.out.println("= 순차 삭제 =");
		System.out.println("ArrayList : " + remove1(al));
		System.out.println("LinkedList : " + remove1(ll));
		System.out.println();
		
		

	}
	public static long add1(List list) { // 연속 삽입
		long start = System.currentTimeMillis(); // 시작 시간 측정
		for(int i=0;i<1000000;i++) list.add(i+"");
		long end = System.currentTimeMillis();
		return end-start;
		
	}
	public static long add2(List list) { // 띄어서 삽입
		long start = System.currentTimeMillis(); // 시작 시간 측정
		for(int i=0;i<10000;i++) list.add(500, "X");
		long end = System.currentTimeMillis();
		return end-start;
		
	}
	public static long remove1(List list) { // 연속 삭제 (ArrayList 전용)
		long start = System.currentTimeMillis(); // 시작 시간 측정
		for(int i=list.size()-1; i>=0; i--) list.remove(i);
		long end = System.currentTimeMillis();
		return end-start;
		
	}
	public static long remove2(List list) { // 연속 삭제 (LinkedList 전용)
		long start = System.currentTimeMillis(); // 시작 시간 측정
		for(int i=0; i<10000;i++) list.remove(i);
		long end = System.currentTimeMillis();
		return end-start;
		
	}
	
	
	

}
