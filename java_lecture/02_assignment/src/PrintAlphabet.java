import java.util.*;
public class PrintAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3장 4번 실습문제
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(char i =c; i >= 'a'; i--) {
			for(char j='a';j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		scanner.close();
		

	}

}
