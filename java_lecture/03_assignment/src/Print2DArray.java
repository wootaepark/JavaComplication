import java.util.Scanner;
public class Print2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		double[][] arr = new double[4][];
		arr[0] = new double[4];
		arr[1] = new double[2];
		arr[2] = new double[3];
		arr[3] = new double[1];
		
		for(int i=0 ;i<arr.length ;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = scanner.nextDouble();
			
			}
			
		}
		for(int i=0 ;i<arr.length ;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}
		
		scanner.close();
	}

}
