package Programmers_nbc;

public class Pr_46 {

	static class Solution {
		public static int solution(String s) {
			
			// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/81301
			int answer = 0;
			String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

			for (int i = 0; i < number.length; i++) {
				s = s.replace(number[i], String.valueOf(i));
				//number[i] 와 일치하는 것을 모두 String.valueOf(i) 값으로 변경한다.
				//replace 와 replaceAll 의 결과가 동일하다
			}
			answer = Integer.parseInt(s);
			
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution("one4"));

	}

}
