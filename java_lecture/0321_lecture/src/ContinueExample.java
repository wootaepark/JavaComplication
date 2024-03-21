import java.util.*;
public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 5 integers.");
		
		int sum = 0;
		int count = 0;
		while(count<5) {
			int number = scanner.nextInt();
			if(number <=0) {count ++; continue;}
			sum += number;
			
			count++;
		}
		System.out.println("The sum of positive numbers : " + sum); 
		scanner.close();

	}

}
