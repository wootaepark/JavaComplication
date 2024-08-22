package Programmers_nbc;

import java.util.*;

public class Pr_40 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/68935

	static class Solution {
		public static int solution(int n) {
			int answer = 0;
			ArrayList<Integer> num_3 = new ArrayList<>();

			while (n>0) {
				num_3.add(n % 3);
				n = n / 3;
				
				
			}
			int j = 1;
			for(int i = num_3.size() - 1; i>=0 ;i--) {
				answer += num_3.get(i) * j;
				j = j*3;
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution(125));

	}

}
