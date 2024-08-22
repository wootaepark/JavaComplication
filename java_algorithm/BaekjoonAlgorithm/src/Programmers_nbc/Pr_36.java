package Programmers_nbc;


public class Pr_36 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12918

	static class Solution {
		public static boolean solution(String s) {
			boolean answer = true;
			char[] arr = s.toCharArray();
			if(arr.length != 4 && arr.length != 6) {
				answer = false;
				return answer;
			}

			for (int i = 0; i < arr.length; i++) {
				if (!(arr[i] >= '0' && arr[i] <= '9')) {
					answer = false; 
					break;
				}
			}
			return answer;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a1234";
		System.out.println(Solution.solution(s));

	}

}
