package Programmers_nbc;

//https://school.programmers.co.kr/learn/courses/30/lessons/12985

public class Pr_80 {

	class Solution {
		public static int solution(int n, int a, int b)
		// n : 게임 참가자 수, a : 참가자 번호, b : 경쟁자 번호
		{
			int answer = 0;
			while (a != b) {
				answer++;
				a = (a + 1) / 2;
				b = (b + 1) / 2;
			}

			return answer;
		}
	}

	public static void main(String[] args) {

	}

}
