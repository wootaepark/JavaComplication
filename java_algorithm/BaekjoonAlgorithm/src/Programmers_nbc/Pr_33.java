package Programmers_nbc;

public class Pr_33 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/77884

	static class Solution {
		public static int solution(int left, int right) {
			int answer = 0;
			for (int i = left; i <= right; i++) {

				int count = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0)
						count++;
				}

				if (count % 2 == 0)
					answer += i;
				else
					answer -= i;
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 24, right = 27;
		System.out.println(Solution.solution(left, right));

	}

}
