import java.util.*;
public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 (-1이 입력될 때 까지)>> ");
		int num = scanner.nextInt();
		
		
		while(num !=-1) {
			v.add(num);
			num = scanner.nextInt();
			
		}
		
		
		int max = v.get(0);
		int i = 1;
		while(i<v.size()) {
			if(max < v.get(i)) {
				max = v.get(i);
			}
			i++;
			
		}
		
		System.out.println("가장 큰 수는 " + max);
		
		
		
		
		scanner.close();
		

	}

}
