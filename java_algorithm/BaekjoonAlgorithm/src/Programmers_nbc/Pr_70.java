package Programmers_nbc;

import java.util.*;

public class Pr_70 {

	// https://school.programmers.co.kr/learn/courses/30/lessons/161990

	// (0, 1), (1,2) , (2, 3)
	class Solution {
		public static int[] solution(String[] wallpaper) {
			
			List<Integer> xList = new ArrayList<>();
			List<Integer> yList = new ArrayList<>();


			for (int i = 0; i < wallpaper.length; i++) {
				char[] c = wallpaper[i].toCharArray();

				for (int j = 0; j < c.length; j++) {
					if(c[j] == '#') {
						xList.add(i);
						yList.add(j);
						
					}
				}
			}
			int[] answer = {
			Collections.min(xList),
			Collections.min(yList),
			Collections.max(xList) + 1,
			Collections.max(yList) + 1
			};

			return answer;
		}
	}

	public static void main(String[] args) {

		String[] wallpaper = { ".#...", "..#..", "...#." };
		System.out.println(Arrays.toString(Solution.solution(wallpaper)));

	}

}
