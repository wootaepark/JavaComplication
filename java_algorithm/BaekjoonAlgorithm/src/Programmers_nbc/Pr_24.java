package Programmers_nbc;

public class Pr_24 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12919
	
	static class Solution{
		public static String solution(String[] seoul) {
			String answer = "";
			
			for(int i=0;i<seoul.length;i++) {
				if(seoul[i].equals("Kim")) {
					answer = "김서방은 " + Integer.toString(i) + "에 있다";
				}
					

			}
			return answer;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = {"Jane", "Kim"};
		System.out.println(Solution.solution(seoul));
	}

}
