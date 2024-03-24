import java.util.*;
import java.io.*;
// 파일, 코드 입출력에 도음되는 기초 코드이므로 자주 봐두자


public class CodePractice {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		System.out.print("숫자를 입력하세요");
		int n = Integer.parseInt(br.readLine());
		System.out.println(n+"입니다.");
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		bw.write(a+" "+b);
		
		
		bw.flush();
		br.close();
		bw.close();
		
	}

}
