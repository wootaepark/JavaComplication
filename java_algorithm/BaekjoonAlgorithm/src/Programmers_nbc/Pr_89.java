package Programmers_nbc;

import java.util.*;

public class Pr_89 {
	class Solution {

		public static int solution(String[] want, int[] number, String[] discount) {
			int answer = 0;
			int days = 10;

			Map<String, Integer> map = new HashMap<>();

			for (int i = 0; i < want.length; i++) {
				map.put(want[i], number[i]);
			}

			for (int i = 0; i < discount.length - days + 1; i++) {
				Map<String, Integer> dMap = new HashMap<>();

				for (int j = 0; j < days; j++) {
					dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
				}

				Boolean isIdentical = true;

				for (String key : map.keySet()) {
					if (map.get(key) != dMap.get(key)) {
						isIdentical = false;
						break;
					}
				}

				answer += isIdentical ? 1 : 0;
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		String[] want = { "banana", "apple", "rice", "pork", "pot" };

		int[] number = { 3, 2, 2, 2, 1 };

		String[] discount = { "chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice",
				"pot", "banana", "apple", "banana" };

		System.out.println(Solution.solution(want, number, discount));

	}

}
