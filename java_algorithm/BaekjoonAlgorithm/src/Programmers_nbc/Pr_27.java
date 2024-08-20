package Programmers_nbc;

public class Pr_27 {

	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12948
	static class Solution{
		public static String solution(String phone_number) {
			String answer = "";
			StringBuilder sb = new StringBuilder(phone_number);
			for(int i=0 ;i<phone_number.length()-4;i++) {
				sb.setCharAt(i, '*');
			}
			answer = sb.toString();
			return answer;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution("01033334444"));
		


	}

}
