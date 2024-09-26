package Programmers_nbc;

import java.util.Arrays;

public class Pr_56 {

	class Solution {
		public static int solution(int k, int m, int[] score) {
			int answer = 0;
			Arrays.sort(score);

			int count = 0;
			for (int i = score.length - 1; i >= 0; i--) {
				count++; // 1
				if (count % m == 0) { // 한상자에 들어갈 과일의 수와 같으면 초기화
					answer += (score[i] * m); // 정렬 되어 있으므로 이렇게 가능
				}

			}

			return answer;
		}
	}

	public static void main(String[] args) {
		
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		System.out.println(Solution.solution(4, 3, score));

	}

}
