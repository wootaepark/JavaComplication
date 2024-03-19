import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Eneter your score(1-100): ");
		int score = scanner.nextInt();

		if(score >= 90) // score가 90 이상
			grade = 'A';
		else if(score >= 80) // score가 80 이상 90 미만
			grade = 'B';
		else if(score >= 70) // score가 70 이상 80 이만
			grade = 'C';
		else if(score >= 60) // score가 60 이상 70 이만
			grade = 'D';
		else // score가 60 이만
			grade = 'F';

		System.out.println("The grade is a/an " + grade + "!");
		
		scanner.close();

	}

}
