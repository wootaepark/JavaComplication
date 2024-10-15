package Programmers_nbc;

import java.util.Arrays;

public class Pr_64 {

	// https://school.programmers.co.kr/learn/courses/30/lessons/42862
	class Solution {
		public static int solution(int n, int[] lost, int[] reserve) {
			int answer = n;
			boolean[] isReserved = new boolean[lost.length];

			Arrays.sort(lost);
			Arrays.sort(reserve);

			for (int i = 0; i < lost.length; i++) {
				for (int j = 0; j < reserve.length; j++) {
					if (reserve[j] == lost[i]) {
						isReserved[i] = true;
						reserve[j] = -1;
						break;
					}
				}
			} // 만약 이걸 먼저 처리해주지 않으면 자신의 체육복을 앞 순번에게 빌려줄 수 있기 때문
			
			
			for (int i = 0; i < lost.length; i++) {
				if (!isReserved[i]) {
					for (int j = 0; j < reserve.length; j++) {
						if (reserve[j] - 1 == lost[i] || reserve[j] + 1 == lost[i]) {
							isReserved[i] = true;
							reserve[j] = -1;
							break;

						}
					}
				}

			}

			for (int i = 0; i < isReserved.length; i++) {
				if (!isReserved[i]) {
					answer -= 1;
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		int[] lost = { 3 };
		int[] reserve = { 1 };

		System.out.println(Solution.solution(3, lost, reserve));
	}

}
