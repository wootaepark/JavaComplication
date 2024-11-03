package Programmers_nbc;

//https://school.programmers.co.kr/learn/courses/30/lessons/12945

public class Pr_78 {
	class Solution {
		public static int solution(int n) {

			int[] dp = new int[n + 1];
			dp[0] = 0;
			dp[1] = 1;

			for (int i = 2; i <= n; i++) {
				dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
			}

			return dp[n];
		}
	}

	public static void main(String[] args) {

		System.out.println(Solution.solution(5));

	}

}
