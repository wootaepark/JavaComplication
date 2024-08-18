package Programmers_nbc;

public class Pr_21 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12947

	static class Solution {
		public static boolean solution(int x) {
			boolean answer = true;
			String tmp = Integer.toString(x);
			int n = tmp.length();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += (tmp.charAt(i) - '0');
			}
			
			if(x % sum !=0) answer = false;
			
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution(12));

	}

}
