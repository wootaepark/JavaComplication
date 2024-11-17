package Programmers_nbc;

//https://school.programmers.co.kr/learn/courses/30/lessons/131701

import java.util.*;

public class Pr_85 {

	class Solution {
		public static int solution(int[] elements) {

			int[] arr = new int[elements.length * 2];

			for (int i = 0; i < elements.length; i++) {
				arr[i] = elements[i];
				arr[i + elements.length] = elements[i];
			}

			Set<Integer> set = new HashSet<>();

			for (int i = 0; i < elements.length; i++) {
				for (int j = 0; j < elements.length; j++) {
					set.add(Arrays.stream(arr, j, j + i).sum());
				}
			}

			return set.size();
		}
	}

	public static void main(String[] args) {

		int[] elements = { 7, 9, 1, 1, 4 };
		System.out.println(Solution.solution(elements));
	}

}
