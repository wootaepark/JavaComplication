package Programmers_nbc;

// https://school.programmers.co.kr/learn/courses/30/lessons/12949

public class Pr_88 {
	
	class Solution {
	    public static int[][] solution(int[][] arr1, int[][] arr2) {
	    	
	    	// 행렬 곱의 연산 결과 크기 예상
	    	int[][] arr = new int[arr1.length][arr2[0].length];
	    	
	    	
	    	for(int i = 0; i < arr1.length; i++) {
	    		for(int j = 0; j < arr2[0].length; j++) {
	    			int temp = 0;
	    			for(int k = 0; k < arr2.length; k++) {
	    				temp += arr1[i][k] * arr2[k][j];
	    			}
	    			arr[i][j] = temp; 
	    		}
	    	}
	    	
	    	return arr;
	    }
	}

	public static void main(String[] args) {
		

	}

}
