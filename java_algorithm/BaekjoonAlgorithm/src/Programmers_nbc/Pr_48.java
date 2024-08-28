package Programmers_nbc;

import java.util.*;

public class Pr_48 {
	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42748
	
	static class Solution{
		public static int[] solution(int[] array, int[][] commands) {
			int[] answer = new int[commands.length];
			for(int i = 0;i < commands.length; i++) {
				int[] tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
				// copyOfRange 를 쓰면 아주 편하게 문제를 해결 할 수 있다.
				Arrays.sort(tmp);
				answer[i] = tmp[commands[i][2]-1];

			}
			
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		
		System.out.println(Arrays.toString(Solution.solution(array, commands)));

	}

}
