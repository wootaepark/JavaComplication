package Programmers_nbc;

//https://school.programmers.co.kr/learn/courses/30/lessons/12951

public class Pr_76 {

	class Solution {
		public static String solution(String s) {
			String answer = "";

			String[] arr = s.split(" ");

			for (int i = 0; i < arr.length; i++) {
				String tmp = arr[i];

				if (arr[i].length() == 0) {
					answer += " ";
				}

				else {
					answer += tmp.substring(0, 1).toUpperCase();
					answer += tmp.substring(1, tmp.length()).toLowerCase();
					answer += " ";
				}
			}

		  
	    	if(s.substring(s.length()-1, s.length()).equals(" ")){
	    		return answer;
	    	}
	    	
	    	
	        return answer.substring(0, answer.length()-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(Solution.solution("3people unFollowed me"));

	}

}
