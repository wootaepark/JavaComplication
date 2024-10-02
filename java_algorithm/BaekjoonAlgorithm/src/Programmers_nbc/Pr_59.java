package Programmers_nbc;

public class Pr_59 {

	// https://school.programmers.co.kr/learn/courses/30/lessons/161989

	class Solution {

		// n: 구획의 수, m: 롤러의 길이, section: 칠해야할 구획의 배열
		public static int solution(int n, int m, int[] section) {
			int answer = 0;
			int lastPainted = 0; // 마지막으로 칠한 구획

			for (int i = 0; i < section.length; i++) {
				// 현재 구획이 마지막으로 칠한 구획을 벗어나면 새로운 롤러로 칠해야 함
				if (section[i] > lastPainted) {
					answer++; // 롤러로 한 번 더 칠함
					lastPainted = section[i] + m - 1; // 롤러의 끝 위치 업데이트
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		int[] section = { 1, 2, 3, 4 };
		System.out.println(Solution.solution(4, 1, section));

	}

}
