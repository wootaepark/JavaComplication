package Programmers_nbc;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/42747

public class Pr_86 {

	class Solution {
		public static int solution(int[] citations) {
			int answer = 0;
	        
	        Arrays.sort(citations);
			
			for(int i = 0; i < citations.length; i++) {
				int h = citations.length - i; // 인용된 논문의 수
				
				if(citations[i] >= h) {
					answer = h;
					break;
				}
			}
	        
	        return answer;
		}
	}

	public static void main(String[] args) {

		int[] citations = { 3, 0, 6, 1, 5 };
		System.out.println(Solution.solution(citations));
	}

}
