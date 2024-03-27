import java.util.Scanner;
public class GetAverageCheats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		double[] score = new double[N];
		double sum=0;
		double max = 0;
		for(int i=0;i<score.length;i++) {
			score[i] = scanner.nextDouble();
			sum += score[i];
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		for(int j=0;j<score.length;j++) {
			score[j] = (score[j]/max) * 100;
			
		}
		
		
		System.out.print(sum/score.length);
		
		
		
		
		scanner.close();
		

	}

}
