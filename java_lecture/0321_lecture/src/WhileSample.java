import java.util.*;
public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer, followed by -1 at the end.");
		
		int n = scanner.nextInt();
		while(n!=-1) {
			sum+=n;
			count ++;
			n = scanner.nextInt();
			
		}
		if(count == 0)System.out.println("No number entered");
		else {
		System.out.println("The number of integers is " + count + ", "
				+ "The Average is " + (double)sum/count+".");
		}
		scanner.close();
		
	}

}
