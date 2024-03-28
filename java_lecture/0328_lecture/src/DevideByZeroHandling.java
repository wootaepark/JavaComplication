import java.util.Scanner;
public class DevideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.print("Enter the dividend : ");
			int dividend = scanner.nextInt();
			System.out.print("Enter the divisor : ");
			int divisor = scanner.nextInt();
			try {
				System.out.println("When " + dividend + " is divided by " + divisor +
						" the quotient is " + dividend/divisor + ".");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("Not divisible by zero! Please enter again.");
				
			}
		}
		
		scanner.close();

	}

}
