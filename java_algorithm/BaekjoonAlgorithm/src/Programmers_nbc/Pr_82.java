package Programmers_nbc;

//https://school.programmers.co.kr/learn/courses/30/lessons/12914

public class Pr_82 {

	class Solution {
		public static long solution(int n) {

			if (n == 1)
				return 1;
			if (n == 2)
				return 2;

			long[] arr = new long[n];
			arr[0] = 1;
			arr[1] = 2;
			for (int i = 2; i < n; i++) {
				arr[i] = (arr[i - 1]+ arr[i - 2]) % 1234567;

			}
			return arr[n - 1];

		}
	}

	public static void main(String[] args) {

		System.out.println(Solution.solution(1));
	}

}
