package Programmers_nbc;

public class Pr_45 {

	static class Solution {
		public static String solution(String s, int n) {
			String answer = "";
			char[] data = s.toCharArray();
			for (int i = 0; i < data.length; i++) {
				if(Character.isLowerCase(data[i])) {
					data[i] = (char) ((data[i]-'a' + n)% 26 + 'a');
					
				}
				else if(Character.isUpperCase(data[i])) {
					data[i] = (char) ((data[i]-'A' + n)% 26 + 'A');
				}
			}
			
			answer = String.valueOf(data);

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution("a B z", 4));

	}

}
