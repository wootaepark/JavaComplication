package Programmers_nbc;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/12939

public class Pr_75 {

	class Solution {
		public static String solution(String s) {

			String[] arr = s.split(" ");

			List<Integer> list = new ArrayList<>();
			
			for (int i = 0; i < arr.length; i++) {
				list.add(Integer.parseInt(arr[i]));
			}
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(Collections.min(list));
			sb.append(" ");
			sb.append(Collections.max(list));

			return sb.toString();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Solution.solution("1 2 3 4"));

	}

}
