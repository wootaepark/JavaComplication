package Programmers_nbc;

import java.util.Arrays;

public class DonutGraph {

	// https://school.programmers.co.kr/learn/courses/30/lessons/258711

	class Solution {

		public static int[] solution(int[][] edges) {
			int[] answer = new int[4];

			int maxNode = 0;
			for (int[] edge : edges) {
				maxNode = Math.max(maxNode, Math.max(edge[0], edge[1]));
			}

			int[][] arr = new int[maxNode+1][2];
			// [나간 간선의 개수, 들어온 간선의 개수] * 백만개

			for (int i = 0; i < edges.length; i++) {
				int start = edges[i][0]; // 나간 곳
				int end = edges[i][1]; // 들어간 곳
				arr[start][0]++;
				arr[end][1]++;

			}

			for (int i = 0; i < maxNode + 1; i++) {
				if (arr[i][1] == 0 && arr[i][0] >= 2) {
					answer[0] = i;
					// 생성 정점 찾기
				} else if (arr[i][1] >= 1 && arr[i][0] == 0) {
					answer[2]++;// 막대 그래프

				} else if (arr[i][0] == 2 && arr[i][1] >= 2) {
					answer[3]++; // 8자 그래프
				}

			}
			answer[1] = arr[answer[0]][0] - answer[2] - answer[3];
			// 도넛 그래프

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] edges = { { 4, 11 }, { 1, 12 }, { 8, 3 }, { 12, 7 }, { 4, 2 }, { 7, 11 }, { 4, 8 }, { 9, 6 },
				{ 10, 11 }, { 6, 10 }, { 3, 5 }, { 11, 1 }, { 5, 3 }, { 11, 9 }, { 3, 8 } };
		System.out.println(Arrays.toString(Solution.solution(edges)));
	}

}
