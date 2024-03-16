import java.util.*;
public class ThreeSixNineGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2장 6번 문제
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		
		int number = scanner.nextInt();
		if((number / 10)%3==0 && (number % 10) % 3 ==0) {
			System.out.println("박수짝짝");
		}
		else if((number / 10)%3==0 || (number % 10) % 3 ==0) {
			System.out.println("박수짝");
		}
		else {
			System.out.println("...");
		}
		scanner.close();

	}

}
