package Programmers_nbc;

import java.util.Scanner;

// 백준 11047번 : https://www.acmicpc.net/problem/11047
public class CoinZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int target = scanner.nextInt();

		int[] coins = new int[N];
		for (int i = 0; i < N; i++) {
			coins[i] = scanner.nextInt();
		}

		int count = 0;
		for (int j = coins.length - 1; j >= 0; j--) {
			if (coins[j] > target) {
				continue;
			}
			int tmp = target / coins[j];
			count = count + tmp;
			target = target % (coins[j] * tmp);

		}

		System.out.println(count);

		scanner.close();

	}

}
