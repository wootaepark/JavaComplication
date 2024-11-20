package Programmers_nbc;

//https://school.programmers.co.kr/learn/courses/30/lessons/87390

import java.util.*;

public class Pr_87 {
	
	class Solution {
	    public static int[] solution(int n, long left, long right) {
	    	 int[] answer = new int[(int) (right - left) + 1];
	    	 
	         int idx = 0;
	         for (long i = left; i <= right; i++) {
	             long row = i / n + 1;
	             long col = i % n + 1;
	             answer[idx++] = (int) Math.max(row, col);
	         }
	  
	         return answer;
	    }
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(Solution.solution(3, 2, 5)));

	}

}
