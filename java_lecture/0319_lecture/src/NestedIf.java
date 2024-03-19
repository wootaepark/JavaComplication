import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a score (0-100): ");
		int score = scanner.nextInt();
		
		System.out.print("Please enter your grade (1-4): ");
		int year = scanner.nextInt();
		
		if(score>=60) {
			if(year!=4) System.out.println("Pass!");
			else if (score >= 70) System.out.println("Pass!");
			else System.out.println("Failed!");
		}
		else System.out.println("Failed!");
		
		scanner.close();

	}

}
