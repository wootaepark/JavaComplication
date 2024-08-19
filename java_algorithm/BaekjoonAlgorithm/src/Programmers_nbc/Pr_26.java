package Programmers_nbc;

public class Pr_26 {

	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/76501
	static class Solution{
		public static int solution(int[] absolutes, boolean[] signs) {
			int answer = 0;
			for(int i=0; i<signs.length;i++) {
				if(!signs[i]) {
					absolutes[i] = absolutes[i] * -1;
				}
				
				answer += absolutes[i];
			}
			return answer;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] absolutes = {4,7,12};
		boolean[] signs = {true, false, true};
		System.out.println(Solution.solution(absolutes, signs));

	}

}
