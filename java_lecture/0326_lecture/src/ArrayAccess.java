import java.util.Scanner;
public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		
		int max = 0;
		System.out.println("Enter 5 positive numbers");
		for(int i=0;i<5;i++) {
			System.out.print(">>");
			intArray[i] = scanner.nextInt();
			if(intArray[i]>max) max = intArray[i];
		}
		System.out.println("The biggest number is " + max);
		
		scanner.close();
	}

}
