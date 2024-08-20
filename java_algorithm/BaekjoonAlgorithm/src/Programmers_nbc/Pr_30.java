package Programmers_nbc;

public class Pr_30 {

	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12903
	static class Solution {
	    public static String solution(String s) {
	        String answer = "";
	        
	        if(s.length()%2 == 1) { // 홀수 인 경우
	        	answer = s.substring(s.length()/2,s.length()/2+1);
	  
	        }
	        else { // 짝수인 경우
	        	answer = s.substring(s.length()/2 -1, s.length()/2+1);
	        }
	        
	       
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution("abcde"));

	}

}
