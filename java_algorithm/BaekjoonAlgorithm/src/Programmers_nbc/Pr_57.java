package Programmers_nbc;

import java.util.Arrays;

public class Pr_57 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/42840
	// 완전 탐색 : BruteForce 알고리즘

	class Solution {
		public static int[] solution(int[] answers) {
			int[] answer = new int[3];

			int[][] person = new int[3][];
			person[0] = new int[] { 1, 2, 3, 4, 5 };
			person[1] = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
			person[2] = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

			for (int i = 0; i < 3; i++) {
				int index = 0; // answers 관련 인덱스
				int count = 0;

				while (index < answers.length) {
					if (person[i][index % person[i].length] == answers[index]) {
						count++;
					}
					index++;
				}
				answer[i] = count;
			}

			int max = Arrays.stream(answer).max().orElse(0);
			int count = (int) Arrays.stream(answer).filter(a -> a == max).count(); // max와 동일한 값 세기

			int[] ans = new int[count];
			int index = 0;
			for (int i = 0; i < answer.length; i++) {
				if (answer[i] == max) {
					ans[index++] = i + 1; // 1번 사람은 1, 2번 사람은 2, ...
				}
			}

			return ans;
		}
	}

	public static void main(String[] args) {
		int[] answers = { 1, 3, 2, 4, 2 };
		System.out.println(Arrays.toString(Solution.solution(answers)));
	}
}
