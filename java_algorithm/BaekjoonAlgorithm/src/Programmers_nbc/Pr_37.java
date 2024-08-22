package Programmers_nbc;

import java.util.Arrays;

public class Pr_37 {
	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12950

	static class Solution {
		public static int[][] solution(int[][] arr1, int[][] arr2) {
			int[][] answer = new int[arr1.length][arr1[0].length];
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1[i].length; j++) {
					answer[i][j] = arr1[i][j] + arr2[i][j];
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		System.out.println(Arrays.deepToString(Solution.solution(arr1, arr2)));

	}

}
