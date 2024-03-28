import java.util.Scanner;
import java.util.InputMismatchException;
public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 integers : ");
		int sum = 0, n = 0;
			for(int i=1; i<4 ;i++) {
				System.out.print(i + ">>");
				try {
					n = scanner.nextInt();
					
				}
				catch(InputMismatchException e) {
					System.out.println("Not an integer, please enter again!");
					scanner.next(); // 위에서 잘못 입력받은 값 비우고, 다음 값 가져오기 위함
					i--;
					continue;
				}
				sum +=n;
			}
			System.out.println("The sum is " + sum);
			scanner.close();

	}

}
