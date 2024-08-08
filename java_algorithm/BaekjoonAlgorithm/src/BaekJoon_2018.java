import java.util.*;
public class BaekJoon_2018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();


		
		int count = 1 ; // 자기 자신의 값 미리 넣기 
		// start_index 부터 end_index 까지 더하는 것이 N 이다. 
		int start_index = 1, end_index = 1;
		int sum = start_index;
		while(true) {
			
			if(end_index == N) break;
			
			if(sum > N) {
				sum = sum - start_index;
				start_index ++;
			}
			else if(sum < N) {
				end_index++;
				sum = sum + end_index;
			}
			else {
				end_index ++;
				sum = sum + end_index;
				count ++;
			}
		
		}
			
			
		
		System.out.println(count);
		
		
		

		
		
		
		
		scanner.close();
	}

}
