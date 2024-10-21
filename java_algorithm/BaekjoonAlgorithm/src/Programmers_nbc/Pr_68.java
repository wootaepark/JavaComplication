package Programmers_nbc;

import java.util.Stack;

public class Pr_68 {

	class Solution {
		public static int solution(int[] ingredient) {
			int answer = 0;
			Stack<Integer> stack = new Stack<>();

			for (int i = 0; i < ingredient.length; i++) {
				stack.push(ingredient[i]);

				// 스택의 마지막 4개가 빵-야채-고기-빵(1, 2, 3, 1)인지 확인
				if (stack.size() >= 4) {
					int fourth = stack.get(stack.size() - 4);
					int third = stack.get(stack.size() - 3);
					int second = stack.get(stack.size() - 2);
					int first = stack.get(stack.size() - 1);

					if (fourth == 1 && third == 2 && second == 3 && first == 1) {
						// 햄버거를 만들었으므로 pop 4회
						stack.pop();
						stack.pop();
						stack.pop();
						stack.pop();
						answer++;
					}
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		int[] ingredient = { 2, 1, 1, 2, 3, 1, 2, 3, 1 };
		System.out.println(Solution.solution(ingredient)); // 2
	}
}
