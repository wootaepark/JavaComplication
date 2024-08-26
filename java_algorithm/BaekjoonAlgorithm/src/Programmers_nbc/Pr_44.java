package Programmers_nbc;

public class Pr_44 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/86491

	static class Solution {
		public static int solution(int[][] sizes) {
			int answer = 0;
			for (int i = 0; i < sizes.length; i++) {
				if (sizes[i][0] < sizes[i][1]) {
					int tmp = sizes[i][0];
					sizes[i][0] = sizes[i][1];
					sizes[i][1] = tmp;
				}

			}
			int max_1 = sizes[0][0];
			int max_2 = sizes[0][1];

			for (int i = 1; i < sizes.length; i++) {
				if(max_1 < sizes[i][0]) {
					max_1 = sizes[i][0];
				}
				if(max_2 < sizes[i][1]) {
					max_2 = sizes[i][1];
				}
				
			}
			answer = max_1 * max_2;
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(Solution.solution(input));

	}

}
