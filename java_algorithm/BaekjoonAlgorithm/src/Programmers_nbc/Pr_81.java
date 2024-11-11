package Programmers_nbc;

//https://school.programmers.co.kr/learn/courses/30/lessons/12953

public class Pr_81 {

	class Solution {
		public static int solution(int[] arr) {
			int answer = 0;

			if (arr.length == 1)
				return arr[0]; 

			int g = gcd(arr[0], arr[1]); // 처음 두 원소의 최대공약수
			answer = (arr[0] * arr[1]) / g; // 처음 두 원소의 최소공배수

		
			if (arr.length > 2) {
				for (int i = 2; i < arr.length; i++) {
					g = gcd(answer, arr[i]);
					answer = (answer * arr[i]) / g;
				}
			}

			return answer;
		}

	
		private static int gcd(int a, int b) {
			int r = a % b;
			if (r == 0)
				return b;
			else
				return gcd(b, r);
		}

	}

	public static void main(String[] args) {
		
		int[] arr = {2,6,8,14};
		System.out.println(Solution.solution(arr));
	}

}
