package Programmers_nbc;

public class Pr_28 {
	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/86051
	
	static class Solution{
		public static int solution(int[] numbers) {
			int answer = -1;
			int sum = 45;
			for(int i=0;i<numbers.length; i++) {
				sum -= numbers[i];
			}
			
			answer = sum;
			return answer;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(Solution.solution(numbers));

	}

}
