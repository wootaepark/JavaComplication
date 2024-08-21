package Programmers_nbc;

public class Pr_32 {

	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/70128
	
	static class Solution{
		public static int solution(int[] a, int[] b) {
			int answer = 0;
			
			int n = a.length;
			for(int i=0; i<n;i++) {
				answer = answer + a[i]*b[i];
			}
			
			return answer;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		int[] b = {-3, -1, 0, 2};
		System.out.println(Solution.solution(a, b));

	}

}
