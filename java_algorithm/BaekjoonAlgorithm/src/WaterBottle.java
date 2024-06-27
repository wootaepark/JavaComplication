import java.util.*;	

// 백준 1052번 : 물병

public class WaterBottle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        
        int bottles = N;
        int count = 0;
        
        // bitCount를 이용해 1의 개수가 K보다 많을 경우 bottles 를 증가시켜 count 증가
        while (Integer.bitCount(bottles) > K) {
            bottles++;
            count++;
        }
        
        System.out.println(count);
        scanner.close();
    }
}

/*
 * 
 * 아래는 틀렸지만 알고리즘을 알고 가는 것 나쁘지 않음 
public class WaterBottle {
	
	static double baseLog(double x, double base) {
		return Math.log(x)/Math.log(base);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		
		
		int count = 0;
		int remain = K; // 더 묶어야 하는 묶음 수 
		
		while(count < K-1 && remain > 0) {
			
			
			if(N<remain) {
				System.out.println(remain - N);
				System.exit(0);
			}
			N = N - (int)Math.pow(2, (int)baseLog(N, 2));
			
			
			
			
			remain--;
			count++;
		}
		
		
		N = (int)Math.pow(2, (int)baseLog(N,2)+1) - N;

		
		System.out.println(N);

		
		
		scanner.close();
	}
	

}*/
