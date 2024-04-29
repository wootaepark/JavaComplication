import java.util.*;
import java.io.*;
// 백준 1051번 (숫자 정사각형)
public class NumberRect {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int col = Integer.parseInt(st.nextToken());
		int row = Integer.parseInt(st.nextToken());
		
		char[][] data = new char[col][row];
		
		for(int i=0;i<col;i++) {
			String line = br.readLine(); // 띄어쓰기가 없는 경우 한줄씩 받아야 되므로 readLine()으로 받는다.
			for(int j=0;j<row;j++) {
				
				data[i][j]=line.charAt(j);
				
			}
			
			
			
		}
		
		int maxSize = 1;
		
		for(int i=0;i<col-1;i++) {
			
			for(int j=0;j<row-1;j++) {
				
				for(int k = 1; (i + k < col) && (j + k < row); k++) {
					if(data[i][j] == data[i][j+k]) {
						if(data[i][j] == data[i+k][j]) {
							if(data[i+k][j] == data[i+k][j+k]) {
								maxSize = Math.max(maxSize, (k + 1) * (k + 1));
							}
							else continue;
						}
						else continue;
					}
					else continue;
				}
				
				
			}
		}
		
		
		System.out.println(maxSize);
		
		
		
		
		
		bw.flush();
		bw.close();
		br.close();
		
		

	}

}
