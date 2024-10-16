package Programmers_nbc;

public class Pr_65 {
	
	//https://school.programmers.co.kr/learn/courses/30/lessons/140108
	class Solution {
	    public static int solution(String s) {
	         int answer = 1;

	        char x = s.charAt(0);
	        int count = 1;
	        for (int i = 1; i < s.length(); i++) {
	            if (count == 0) {
	                answer++;
	                x = s.charAt(i);
	            }

	            if (x == s.charAt(i)) {
	                count++;
	            } else {
	                count--;
	            }
	        }


	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "banana";
		System.out.println(Solution.solution(s));

	}

}
