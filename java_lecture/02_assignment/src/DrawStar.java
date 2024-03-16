import java.util.*;
public class DrawStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3장 3번 실습문제
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int number = scanner.nextInt();
		
		for(int i = number; i>0; i--) {
			for(int j = 0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
