import java.util.*;

// 백준 1904 문제 : 01타일 // 추후 풀이 예정
public class _01Tile {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		long[] size = new long[N];

		
		size[0] = 1;
		if(N >= 2) {
			size[1] = 2;
		}
		
		if(N>2) {
			for(int i=2; i<N; i++) {

				size[i] = (size[i-1] + size[i-2]) % 15746;
			
				// 해당 알고리즘 찾는것이 핵심이다.
		}
			
		}
		
		System.out.println(size[N-1]); // 오버플로우 방지
		
		scanner.close();
	}

}
