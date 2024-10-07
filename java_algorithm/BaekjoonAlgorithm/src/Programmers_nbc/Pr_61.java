package Programmers_nbc;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/77484

class Solution {
	final static int MAX = 7;

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = { MAX, MAX };
		int count = 0;// 맞은 개수
		int zeroCount = 0; // 0 의 개수
		for (int i = 0; i < lottos.length; i++) {

			// 0인경우
			if (lottos[i] == 0) {
				zeroCount++;
				continue;
			}
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					count++;
				}

			}
		}

		answer[0] = MAX - count - zeroCount; // 최고 등수
		answer[1] = MAX - count; // 최저 등수
		
		if(MAX == answer[0]) {
			answer[0] = MAX -1 ;
		}
		if(MAX == answer[1]) {
			answer[1] = MAX -1 ;
		}
		
		return answer;
	}
}

public class Pr_61 {

	public static void main(String[] args) {

		int[] lottos = { 45, 4, 35, 20, 3, 9};
		int[] win_nums = { 20, 9, 3, 45, 4, 35 };
		System.out.println(Arrays.toString(Solution.solution(lottos, win_nums)));

	}

}
