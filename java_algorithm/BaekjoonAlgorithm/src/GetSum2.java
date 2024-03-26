import java.util.*;
public class GetSum2 {
	// 백준 11660번, 시간 초과 코드
	// 일반적인 for문 이용 (시간복잡도 이용)
	
	
	static int getSum(int arr[][],int sRow, int sCol, int eRow, int eCol) {
		
		int result = 0;
		for(int i=sRow;i<=eRow;i++) {
			for(int j=sCol;j<=eCol;j++) {
			result+=arr[i][j];
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		int size = scanner.nextInt();
		int getCount = scanner.nextInt();
		
		int[][] data = new int[size][size];
		
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[0].length;j++) {
				data[i][j] = scanner.nextInt();
			}
		}
		
		// 테이블 배열 데이터 입력 끝
		
		int sR, sC, eR, eC;
		
		int result[] = new int[getCount];
		
		for(int k =0;k<getCount;k++) {
			sR = scanner.nextInt()-1;
			sC = scanner.nextInt()-1;
			eR = scanner.nextInt()-1;
			eC = scanner.nextInt()-1;
			result[k] = getSum(data,sR,sC,eR,eC);
		}
		
		for(int t=0;t<result.length;t++) {
			System.out.println(result[t]);
		}
		
		
		
		
		
		
		scanner.close();
	}

}
