import java.util.Scanner;
public class isSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("2자리수 정수 입력(10~99)>> ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number % 10 == number / 10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		
		
		
		
		scanner.close();
	}

}
