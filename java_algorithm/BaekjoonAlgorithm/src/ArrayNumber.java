import java.util.*;
import java.io.*;
public class ArrayNumber {
	
	// 간단한 백준 2750 문제
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] data = new int[N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			data[i] = Integer.parseInt(st.nextToken());

		}
		Arrays.sort(data);
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		
		
		br.close();
		bw.flush();
		bw.close();

	}

}
