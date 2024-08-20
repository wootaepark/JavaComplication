package Programmers_nbc;

public class Pr_31 {
	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12922

	static class Solution{
		public static String solution(int n) {
			String answer = "";
			for(int i=0;i<n;i++) {
				if(i%2==0) {
					answer += "수";
				}
				else {
					answer += "박";
				}
			}
			
			return answer;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Solution.solution(4));
	}

}
