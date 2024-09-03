package Programmers_nbc;

import java.util.*;

public class Pr_53 {

	static class Solution {
		public static int[] solution(int k, int[] score) {
			int[] answer = new int[score.length];
			PriorityQueue<Integer> rank = new PriorityQueue<>();

			for (int i = 0; i < score.length; i++) {
				rank.offer(score[i]);

				// 큐의 크기가 k를 초과하면 최소값 제거
				if (rank.size() > k) {
					rank.poll();
				}

				// 큐의 최소값 (최소 힙의 루트값)이 현재 i번째의 답
				answer[i] = rank.peek();
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		int[] score = { 10, 100, 20, 150, 1, 100, 200 };
		System.out.println(Arrays.toString(Solution.solution(3, score)));
	}
}
