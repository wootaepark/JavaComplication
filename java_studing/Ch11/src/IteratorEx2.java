import java.util.*;
public class IteratorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> original = new ArrayList<>(10);
		ArrayList<String> copy1 = new ArrayList<>(10);
		ArrayList<String> copy2 = new ArrayList<>(10);
	
		
		for(int i=0;i<10;i++) {
			original.add(i+"");
		}
		
		Iterator<String> it = original.iterator();
		
		while(it.hasNext()) {
			copy1.add(it.next());
		}

		System.out.println("= Original 에서 copy1로 복사(copy) =");
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		System.out.println();
		
		it = original.iterator(); // Iterator 를 초기화 하고 다시 사용하려면 다시 얻어와야 한다.
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
			
		}
		System.out.println("= Original 에서 copy2로 이동(move) =");
		System.out.println("original:"+original);
		System.out.println("copy2:"+copy2);
		System.out.println();
		
	}

}
