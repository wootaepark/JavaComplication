
// 백준 1026번 : https://www.acmicpc.net/problem/1026
import java.util.*;

public class Treasure {

	public static int mulSum(int[] a, int[] b) {
		int answer = 0;
		

		Arrays.sort(a);
		
		Integer[] tmp = Arrays.stream(b).boxed().toArray(Integer[]::new); 
		
		// 아래 줄은 원래 같으면 오류나지만 boxing 을 통해 오류룰 해결
		Arrays.sort(tmp, Collections.reverseOrder());
		
		for(int i=0;i<a.length;i++) {
			answer = answer + (a[i] * tmp[i]);
		}

		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		for (int j = 0; j < N; j++) {
			B[j] = scanner.nextInt();
		}
		
		System.out.println(mulSum(A,B));

		scanner.close();

	}

}
