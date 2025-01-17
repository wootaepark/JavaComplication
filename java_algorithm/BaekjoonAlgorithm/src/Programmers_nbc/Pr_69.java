package Programmers_nbc;

import java.util.*;

public class Pr_69 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/118666

	class Solution {
		public static String solution(String[] survey, int[] choices) {
			Map<Character, Integer> map = new HashMap<>();

			for (int i = 0; i < survey.length; i++) {
				int value = choices[i];

				if (value > 0 && value < 4) {
					char ch = survey[i].charAt(0);
					map.put(ch, map.getOrDefault(ch, 0) + 4 - value);
				} else if (value > 4) {
					char ch = survey[i].charAt(1);
					map.put(ch, map.getOrDefault(ch, 0) + value - 4);
				}

			}

			return new StringBuilder().append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
					.append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
					.append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
					.append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N').toString();
		}
	}

	// https://school.programmers.co.kr/learn/courses/30/lessons/118666

	public static void main(String[] args) {

		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
		int[] choices = { 5, 3, 2, 7, 5 };

		System.out.println(Solution.solution(survey, choices));

	}

}
