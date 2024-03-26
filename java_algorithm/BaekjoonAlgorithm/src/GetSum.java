import java.util.*;
import java.io.*;
public class GetSum {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[size+1][size+1];
		int[][] sum = new int[size+1][size+1];
		
		
		for(int i = 1;i<size+1;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1;j<size+1;j++) {
				
				arr[i][j] = Integer.parseInt(st.nextToken());
				
			}
		}
	
		
		for(int i=1;i<size+1;i++) {
			for(int j=1;j<size+1;j++) { // dp 알고리즘 사용
				sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + arr[i][j];
			
			}
		}
		
		int[] result = new int[count];
		
		for(int t=0;t<count;t++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			result[t] = sum[c][d] - sum[a-1][d] - sum[c][b-1] + sum[a-1][b-1];
			
			
		}
		
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
		
		
	
		
		br.close();
		bw.flush();
		bw.close();
		

	}

}
