package Programmers_nbc;

public class Pr_41 {
	
	static class Solution {
		public static String solution(String s) {
			String answer = "";
	        int count = 0;
	        String[] array = s.split("");

	        for(int i=0; i<array.length; i++) {
	            count = array[i].contains(" ") ? 0 : count + 1;
	            answer += count%2 == 0 ? array[i].toLowerCase() : array[i].toUpperCase(); 
	        }
	      return answer;
		}
	}

	public static void main(String[] args) {
		String s = "try hello world";
		System.out.println(Solution.solution(s)); // Expected Output: "TrY HeLlO WoRlD"
	}
}
