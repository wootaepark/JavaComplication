package Programmers_Lv2;

import java.util.ArrayList;

public class FirstCache {

	// https://school.programmers.co.kr/learn/courses/30/lessons/17680?language=java

	class Solution {
		public static int solution(int cacheSize, String[] cities) {
			int answer = 0;
			ArrayList<String> cache = new ArrayList<>();

			if (cacheSize == 0) {
				return cities.length * 5;
			}

			for (String s : cities) {
				String city = s.toUpperCase();

				if (cache.contains(city)) {
					cache.remove(city);
					cache.add(city);
					answer += 1;
				} else {
					if (cache.size() == cacheSize) {
						cache.remove(0);
					}
					cache.add(city);
					answer += 5;
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		int cacheSize = 3;
		System.out.println(Solution.solution(cacheSize, cities));
	}
}
