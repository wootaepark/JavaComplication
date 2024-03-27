import java.util.Scanner;
public class GetSumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String str = scanner.next();
		
		
		char[] c = str.toCharArray();
		int sum = 0;
		for(int i=0;i<c.length;i++) {
			sum+=c[i]-'0';
		}
		
		System.out.print(sum);
		scanner.close();

	}

}
