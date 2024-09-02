package Programmers_nbc;

import java.util.*;

public class Pr_49 {
	
	// 링크 :https://school.programmers.co.kr/learn/courses/30/lessons/68644
	
	static class Solution {
		public static int[] solution(int[] numbers) {
			Set<Integer> productSet = new HashSet<>();
			for (int i = 0; i < numbers.length - 1; i++) {
				for (int j = i + 1; j < numbers.length; j++) {
					int product = numbers[i] + numbers[j];
					productSet.add(product); 
				}
			}
	
			
			

			int[] answer = productSet.stream().mapToInt(Integer::intValue).toArray();
			Arrays.sort(answer); 

			return answer;
		}
	}

	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		System.out.println(Arrays.toString(Solution.solution(numbers)));
	}
}
