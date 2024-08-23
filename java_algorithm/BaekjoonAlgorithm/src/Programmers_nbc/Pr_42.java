package Programmers_nbc;

public class Pr_42 {
	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131705
	
	static class Solution{
		public static int solution(int[] number) {
			
	        int answer = 0;
	        
	        for(int i=0;i<number.length;i++) {
	        	for(int j=i+1; j<number.length;j++) {
	        		for(int k=j+1;k<number.length;k++) {
	        			if(number[i] + number[j] + number[k] == 0) {
	        				answer ++;
	        			}
	        		}
	        	}
	        }
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {-2, 3, 0, 2, -5};
		System.out.println(Solution.solution(number));

	}

}
