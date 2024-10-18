package Programmers_nbc;

public class Pr_67 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/155652

	class Solution {
		public static String solution(String s, String skip, int index) {
			// s = "aukks"
			// skip = "wbqd"

			StringBuilder sb = new StringBuilder();

			char[] arr = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {

				int count = 0;
				while (count < index) {
					arr[i]++;

					if (arr[i] > 'z') {
						arr[i] -= 26;
					}

					boolean isSkip = false;
					for (char c : skip.toCharArray()) {
						if (c == arr[i]) {
							isSkip = true;
							break;
						}
					}
					if (!isSkip) {
						count++;
					}
				}
				sb.append(arr[i]);
			}

			return sb.toString();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aukks";
		String skip = "wbqd";
		System.out.println(Solution.solution(s, skip, 5));

	}

}
