package Programmers_nbc;
import java.util.*;
public class Pr_25 {

	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12910
	
	static class Solution{
		public static ArrayList<Integer> solution(int[] arr, int divisor) {
			ArrayList<Integer> data = new ArrayList<>();
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%divisor == 0){
					data.add(arr[i]);
				}
			}
			if(data.size() ==0) {
				data.add(-1);
			}
			Collections.sort(data);
			return data;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 36, 1, 3};
		System.out.println(Solution.solution(arr, 1));
		
	}

}
