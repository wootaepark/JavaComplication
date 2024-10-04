package Programmers_nbc;

public class Pr_60 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/136798

	class Solution {
		public static int solution(int number, int limit, int power) {
			int answer = 0;

			for (int i = 1; i <= number; i++) { //약수의 대칭성 이용
				int count = 0; // 약수의 개수
				for (int j = 1; j * j <= i; j++) { // 2부터 j가 자신의 제곱근 까지

					if (i % j == 0) {
						count++; // 나누어 떨어지는 경우 count 증가
						if (j != i / j) { // i 가 j의 제곱 관계가 아닌 경우
							count++;
						}
					}

					if (count > limit) {
						count = power; // 증가 이후의 값이 더 크면 대체값으로 변경
						break;
					}

				}
				answer += count;
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		System.out.println(Solution.solution(10, 3, 2));

	}

}
