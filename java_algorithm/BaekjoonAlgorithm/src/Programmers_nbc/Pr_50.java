package Programmers_nbc;

import java.util.Arrays;

public class Pr_50 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/142086

	static class Solution {
		public static int[] solution(String s) {
			char[] arr = s.toCharArray();
			int[] alphabet = new int[26];
			Arrays.fill(alphabet, -1);
			int[] answer = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				int index = arr[i] - 'a';
				
				if(alphabet[index] == -1) { // 처음 나오는 경우
					answer[i] = -1;
					alphabet[index] = i;
				}
				else { // 이전에 나온 적이 있는 경우
					answer[i] = i -alphabet[index];
					alphabet[index] = i;
					
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(Solution.solution("banana")));
		
	}

}
