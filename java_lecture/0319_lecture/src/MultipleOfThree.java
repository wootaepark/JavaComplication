import java.util.Scanner;
public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a natural number: ");
		int number = scanner.nextInt();
		
		if(number % 3 == 0) {
			System.out.println("It is a multiple of 3");
		}
		else {
			System.out.println("It is not a multiple of 3.");
		}
		
		scanner.close();
		
	}

}
