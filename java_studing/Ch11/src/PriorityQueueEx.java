import java.util.*;
public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq = new PriorityQueue<>();
		// <> 를 통해 데이터의 형식의 일관성을 유지해주는 것이 좋다.
		
		
		
		pq.offer(3); // pq.offer(new Integer(3)); 오토 박싱됨
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq);
		
		Object obj = null;
		
		while((obj = pq.poll()) != null) {
			System.out.println(obj);
		}

	}

}
