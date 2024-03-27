import java.util.*;
import java.io.*;
public class GetSum01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		int[] data = new int[size];
		int[] sum = new int[size];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<size;i++) {
			data[i] = Integer.parseInt(st.nextToken());
			if(i == 0) {
				sum[i] = data[i];
				continue;
			}
			sum[i] = sum[i-1]+data[i];

		}
		for(int j=0;j<count;j++) {
			st = new StringTokenizer(br.readLine());
			int index1 = Integer.parseInt(st.nextToken());
			int index2 = Integer.parseInt(st.nextToken());
			
			bw.write(sum[index2-1]-sum[index1-1]+data[index1-1]+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

		

	}

}
