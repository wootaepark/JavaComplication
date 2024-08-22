package Programmers_nbc;

import java.util.*;

public class Pr_39 {
	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12940

	static class Solution {
		public static int[] solution(int n, int m) {
			int[] answer = new int[2];

			for (int i = n; i > 0; i--) { // 최대공약수
				if (n % i == 0 && m % i == 0) {
					answer[0] = i;
					break;
				}
			}

			answer[1] = (n / answer[0]) * (m / answer[0]) * answer[0]; // 최소공배수

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12 ,m = 18;
		System.out.println(Arrays.toString(Solution.solution(n, m)));

	}

}
