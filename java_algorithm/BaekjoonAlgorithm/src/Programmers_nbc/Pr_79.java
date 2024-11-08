package Programmers_nbc;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/42842

public class Pr_79 {
	
	class Solution {
	    public static int[] solution(int brown, int yellow) {
	        int[] answer = new int[2];
	 
	        int carpet = brown + yellow;
	 

	        for (int i = 3; i <= carpet; i++) {
	            int col = i; 
	            int row = carpet / col; 
	 

	            if (row < 3) {
	                continue;
	            }

	            if (row >= col) {
	                if ((row - 2) * (col - 2) == yellow) {
	                    answer[0] = row;
	                    answer[1] = col;
	                    break;
	                }
	            }
	        }
	        return answer;
	    }
	}

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(Solution.solution(10, 2)));
	}

}
