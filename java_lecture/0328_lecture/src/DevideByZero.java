import java.util.Scanner;
public class DevideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		System.out.print("Enter the Dividend : ");
		dividend = scanner.nextInt();
		System.out.print("Enter the divisor : ");
		divisor = scanner.nextInt();
		System.out.println("When " + dividend + "is divided by " + divisor + ", the quotient is " +
		dividend/divisor + ". "	);
		scanner.close();
		
	}

}
