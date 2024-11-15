package Programmers_nbc;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/76502

public class Pr_84 {

	class Solution {
		public static int solution(String s) {
			int answer = 0;

			for (int i = 0; i < s.length(); i++) {

				s = s.substring(1) + s.charAt(0);
				
				if (isCorrect(s)) {
					answer++;
				}

			}

			return answer;
		}

		public static boolean isCorrect(String s) {

			char[] arr = s.toCharArray();
			Stack<Character> stack = new Stack<>();

			for (char ch : arr) {
				if (ch == '{' || ch == '(' || ch == '[') {
					stack.push(ch);

				} else {
					if (stack.isEmpty()) {
						return false;
					}

					char last = stack.pop();
					if ((ch == '}' && last != '{') || (ch == ']' && last != '[') || (ch == ')' && last != '(')) {
						return false;
					}

				}

			}
			return stack.isEmpty();

		}
	}

	public static void main(String[] args) {
		System.out.println(Solution.solution("[](){}"));

	}

}
