import java.util.Scanner;
public class GradingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("Enter your score (0-100): ");
		int score = scanner.nextInt();
		switch(score/10) {
		case 10: case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		
		System.out.println("The grade is a/an " + grade + "!");
		scanner.close();

	}

}
