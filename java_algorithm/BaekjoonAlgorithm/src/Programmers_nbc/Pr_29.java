package Programmers_nbc;

import java.util.*;

public class Pr_29 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12935
	static class Solution {

		public static int[] solution(int[] arr) {
			int min = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
					
				}
			}
			int[] answer;
			int index = 0;
			if (arr.length - 1 == 0) {
				answer = new int[1];
				answer[0] = -1;
			}
			else {
				answer = new int[arr.length - 1];
				for (int i = 0; i < arr.length; i++) {
					if(arr[i] == min) {
						continue;
					}
					else {
						answer[index++] = arr[i];
						
					}
					
					
				}
			}

			return answer;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2, 1 };
		System.out.println(Arrays.toString(Solution.solution(arr)));
		

	}

}
