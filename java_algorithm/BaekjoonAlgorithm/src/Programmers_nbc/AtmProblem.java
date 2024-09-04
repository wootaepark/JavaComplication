package Programmers_nbc;

import java.util.*;

public class AtmProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 입력 부분

		int N = scanner.nextInt(); // 데이터의 개수
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		

		// 정렬 부분 (선택 정렬)
		for (int j = 1; j < N; j++) { // 정렬을 검사할 횟수 (0번을 제외한 1번 인덱스 ~ 마지막 인덱스 까지)
			
			int index = j; // 들어갈 위치
			int value = arr[j]; // 들어갈 값

			for (int k = j - 1; k >= 0; k--) {
				if (arr[j] > arr[k]) {
					index = k + 1;
					break;
				}
				if (k == 0) {
					index = 0;
				}
			}

			for (int k = j; k > index; k--) { // 대입하는 과정
				arr[k] = arr[k-1];
			}
			arr[index] = value;
		}

		
		// 부분 합
		
		int sum = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i+1] = arr[i] + arr[i+1];
			sum += arr[i+1];
			
		}
		System.out.println(sum);

		scanner.close();

	}

}
