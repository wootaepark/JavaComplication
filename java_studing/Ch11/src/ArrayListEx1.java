import java.util.*;

// ArrayList 를 이해하고 메서드 활용해보기
public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 기존 내용은 삭제하지 않으면서 해당 위치로 들어감
		print(list1, list2);
		
		list2.set(3, "AA"); // "AA" 대신에 컬렉션 (ArrayList, LinkedList 등을 넣기도 가능)
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		
	
		print(list1, list2);
		
		// listt2에서 list1에 포함된 객체들을 삭제한다.
		// 감소 시키며 삭제가 아니라 증가시키며 삭제하면 자리 이동에 의해 올바른 결과가 나오지 않는다.
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
		
		
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
}

}

