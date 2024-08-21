package Programmers_nbc;

public class Pr_35 {
	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/82612
	
	static class Solution{
		public static long solution(int price, int money, int count) {
			long answer = 0;
			for(int i=0;i<count ;i++) {
				answer += price * (i + 1);
			}
			if(money > answer) {
				answer = 0;
			}
			else {
				answer = answer - money;
			}
			
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution(3,20,4));

	}

}
