package Programmers_nbc;


public class Pr_63 {

	// https://school.programmers.co.kr/learn/courses/30/lessons/131128

	class Solution {
		public static String solution(String X, String Y) {

			int[] countX = new int[10]; // 0 ~ 9 까지 빈도
			int[] countY = new int[10];

			for (char ch : X.toCharArray()) {
				countX[ch - '0']++;
			}

			for (char ch : Y.toCharArray()) {
				countY[ch - '0']++;
			}
			StringBuilder sb = new StringBuilder();

			for (int i = 9; i >= 0; i--) {
				int count = Math.min(countX[i], countY[i]);
				for(int j=0;j<count;j++) {
					sb.append(i);

				}
				
				
			}
			if(sb.length()==0) {
				return "-1";
			}
			
			if(sb.charAt(0) == '0') {
				return "0";
			}
			
		

			return sb.toString();
		}
	}

	public static void main(String[] args) {
		
		String X = "5525";
		String Y = "1255";

		System.out.println(Solution.solution(X, Y));
	}

}
