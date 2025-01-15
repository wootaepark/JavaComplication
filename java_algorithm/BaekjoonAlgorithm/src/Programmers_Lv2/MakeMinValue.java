package Programmers_Lv2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12941

import java.util.Arrays;
import java.util.Collections;

public class MakeMinValue {

	class Solution
	{
		public static int solution(int []A, int []B)
		{
			int answer = 0;
			Arrays.sort(A);
			Integer[] BBoxed = Arrays.stream(B).boxed().toArray(Integer[]::new);
			Arrays.sort(BBoxed, Collections.reverseOrder());

			for(int i=0;i<A.length;i++){
				answer = answer + (A[i] * BBoxed[i]);
			}

			return answer;
		}
	}


	public static void main(String[] args) {
		int[] arr1 = {1,2};
		int[] arr2 = {3,4};
		System.out.println(Solution.solution(arr1, arr2));
	}
}
