import java.util.*;
import java.io.*;

// 백준 10986번 문제
// 일반적인 2차원 배열을 이용한 구간 합으로 구현은 가능하나 시간초과 발생 
public class RemainSum {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] data = new int[N];
		int[] sum = new int[N+1];
		int count = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int j=1;j<N+1;j++) {
			sum[j] = sum[j-1]+data[j-1];

			
		}	
		for(int j=0;j<N+1;j++) {
	
			System.out.print(sum[j]+" ");
			
		}	
		
	
		
		
		System.out.println();
		System.out.println(count);
		
		
		
		br.close();

	}

}
