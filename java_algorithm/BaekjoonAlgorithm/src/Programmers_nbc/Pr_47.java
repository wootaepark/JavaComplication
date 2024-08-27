package Programmers_nbc;

import java.util.Arrays;

public class Pr_47 {
	static class Solution {
		public static String[] solution(String[] strings, int n) {
			String[] answer = {};

		

			String tmp;

			for (int i = 0; i < strings.length-1; i++) {
				int minIdx = i;
				for (int j = i+1; j < strings.length; j++) {
					if (strings[minIdx].charAt(n) > strings[j].charAt(n)) {
						tmp = strings[j];
						strings[j] = strings[minIdx];
						strings[minIdx] = tmp;

					}
					else if(strings[minIdx].charAt(n) == strings[j].charAt(n)) {
						if(strings[minIdx].compareTo(strings[j])>0) {
							tmp = strings[j];
							strings[j] = strings[minIdx];
							strings[minIdx] = tmp;
						}
					}
				}

			}
			answer = strings.clone();

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = { "abce", "abcd", "cdx" };

		System.out.println(Arrays.toString(Solution.solution(strings, 2)));

	}

}
