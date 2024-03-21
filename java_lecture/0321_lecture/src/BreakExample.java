import java.util.Scanner;
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("If you enter 'exit', the program will terminate");
		while(true) {
			String str = scanner.nextLine();
			if(str.equals("exit")) break;
			
			
		}
		System.out.println("The Program will be terminated");
		
		scanner.close();

	}

}
