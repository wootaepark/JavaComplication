package Programmers_nbc;

import java.util.Arrays;
import java.util.Scanner;

//백준 1253번 : https://www.acmicpc.net/problem/1253

public class GoodNumber {

	/*public static void sortArray(int[] arr) {

		// 어제 했던 삽입 정렬을 이용함
		for (int i = 1; i < arr.length; i++) {
			int index = i;
			int value = arr[i];

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					index = j + 1;
					break;
				}
				if (j == 0) {
					index = 0;
				}
			}

			for (int j = i; j > index; j--) {
				arr[j] = arr[j - 1];
			}
			arr[index] = value;

		}

	}*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		// 정렬 완료 ( 더 좋은 정렬 알고리즘으로 제출 시 에는 수정할 예정)
		Arrays.sort(arr);


		int count = 0;

		for (int i = 0; i < arr.length; i++) { // 입력 값이 음의 정수인 경우도 고려할 필요 있음
			int index1 = 0, index2 = arr.length - 1;
			while(index1 < index2) {

				
				
				
				int sum = arr[index1] + arr[index2];
				if(sum == arr[i]) {
					count++;
					break;
				}
				else if(sum < arr[i]) {
					index1++;
				}
				else {
					index2--;
				}
			}
			
		}

		System.out.println(count);
		scanner.close();

	}

}
