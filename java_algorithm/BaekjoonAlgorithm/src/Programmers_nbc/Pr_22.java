package Programmers_nbc;

public class Pr_22 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12912

	static class Solution {
		public static long solution(int a, int b) {
			long answer = 0;
			if (a > b) {
				int tmp = a;
				a = b;
				b = tmp;
			}

			for (int i = a; i <= b; i++) {
				answer +=i;
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution(3,5));

	}

}
