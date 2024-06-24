import java.util.*;

// 백준 13900 : 순서쌍 곱의 합
import java.util.*;

public class SumOfProducts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[] ar = new int[N];
        
        for(int i = 0; i < N; i++) {
            ar[i] = scanner.nextInt();
        }
        
        long totalSum = 0;
        for(int i = 0; i < N; i++) {
            totalSum += ar[i];
        }
        
        long result = 0;
        for(int i = 0; i < N; i++) {
            totalSum -= ar[i];
            result += ar[i] * totalSum;
        }
        
        System.out.println(result);
        
        scanner.close();
    }
}

/*
 * 첫 번째로 푼 코드는 너무 복잡하다. (그리고 어쨰선지 모르지만 오답이다.)
 * 
 * public class SumOfProducts {
	
	static int getSum(int[] ar, int endIdx) {
		
		//if(endIdx>ar.length-1) System.exit(-1); // 강제 종료
		
		int sum = 0;
		for(int i=0; i< endIdx+1 ; i++) {
			sum += ar[i];
		}
		return sum;
	}
	
	
	
	static int getResult(int[] ar, int index) {
		
		int sum = 0;
		
		if(index >0)
			sum = getSum(ar, index-1);

		int result = sum * ar[index];
		
		
		return result;
	}

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int[] ar = new int[N];
	
		
		for(int i=0;i<N;i++) {
			ar[i] = scanner.nextInt();
		}
		
		int[] result = new int[N];
		result[0] = 0;
		
		for(int i=1;i<N;i++) {
			result[i] = result[i-1] + getResult(ar, i);
		}
		
		System.out.println(result[N-1]);
		
		
		
		
		
		scanner.close();

	}

}*/
