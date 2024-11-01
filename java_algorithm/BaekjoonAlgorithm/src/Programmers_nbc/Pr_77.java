package Programmers_nbc;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/70129

public class Pr_77 {
	
	class Solution {
		  public static int[] solution(String s) {
		    int[] answer = new int[2];
		 
		    while(s.length() > 1) {
		 
		      int cntOne = 0;
		      for(int i=0; i<s.length(); i++) {
		 
		        if(s.charAt(i) == '0') answer[1]++;
		        else cntOne++;
		      }
		 
		      s = Integer.toBinaryString(cntOne);
		      answer[0]++;
		    }
		 
		    return answer;
		  }
		}


	public static void main(String[] args) {
		
		String s = "110010101001";
		
		System.out.println(Arrays.toString(Solution.solution(s)));

	}

}
