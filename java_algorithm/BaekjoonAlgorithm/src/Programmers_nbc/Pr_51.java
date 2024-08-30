package Programmers_nbc;

public class Pr_51 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/134240
	static class Solution {
		public static String solution(int[] food) {
			String answer = "";
			
			for (int i = 1; i < food.length; i++) {
				for(int j = 0; j<food[i]/2;j++) {
					answer += String.valueOf(i);
				}
			}
			String tm = answer;
			answer += "0";
			
			
			StringBuilder sb = new StringBuilder(tm);
			String tmp = sb.reverse().toString();
			answer += tmp;
			
			System.out.println(answer);

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] food = {1,3,4,6};
		Solution.solution(food);

	}

}
