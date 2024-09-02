package Programmers_nbc;

public class Pr_52 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/132267
	
	
	static class Solution{
		public static int solution(int a, int b, int n) {
			// 빈 병 'a' 개를 가져다주면 콜라 'b' 병을 주는 마트
			int answer = 0;

			int remain = n; // 남아 있는 콜라 병 (공병 포함) 의 수
			while (true) {
				if(remain < a) {
					break;
				}
				int N = remain / a; // 비율
				answer += (N * b); 
				remain = remain - (N * a) + (N * b);
				System.out.println("남은 개수 : " + answer);
				

			}

			return answer;
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution(3, 1, 20));

	}

}
