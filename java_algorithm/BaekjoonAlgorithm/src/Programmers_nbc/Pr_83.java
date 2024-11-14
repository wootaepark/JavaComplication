package Programmers_nbc;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/138476

public class Pr_83 {

	class Solution {
		public static int solution(int k, int[] tangerine) {
			int answer = 0;

			Map<Integer, Integer> map = new HashMap<>();

			for (int i : tangerine) {
				map.put(i, map.getOrDefault(i, 0) + 1);
			}

			List<Integer> keyList = new ArrayList<>(map.keySet());
			keyList.sort(((o1, o2) -> map.get(o2) - map.get(o1)));
			// 개수가 많은 순으로 정렬

			for (Integer i : keyList) {
				if (k <= 0) {
					break;
				}

				answer++;
				k -= map.get(i);
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		int[] tangerine = { 1, 3, 2, 5, 4, 5, 2, 3 };
		System.out.println(Solution.solution(6, tangerine));

	}

}
