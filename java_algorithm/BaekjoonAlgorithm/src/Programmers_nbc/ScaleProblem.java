package Programmers_nbc;

import java.util.*;

public class ScaleProblem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);

		int sum = 0;
		for (int i = 0; i < N ; i++) {
			
			if (sum + 1< arr[i]) {
				break;
			}sum += arr[i];
		}

		System.out.println(sum+1);
		scanner.close();
	}

}
