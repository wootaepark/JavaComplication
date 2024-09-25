package Programmers_nbc;

import java.util.*;

public class Pr_55 {

	// 링크 :
	// https://school.programmers.co.kr/learn/courses/30/lessons/159994?language=java

	class Solution {
		public static String solution(String[] cards1, String[] cards2, String[] goal) {
			String answer = "Yes";


			int cards1Index = 0;
			int cards2Index = 0;

			for (int i = 0; i < goal.length; i++) {
				
				// 카드 길이를 비교하는 조건이 없으면 cardIndex 가 증가한 후 비교 될 수 있기 때문에 
				// 인덱스가 초과된 상태로 조건문이 실행 될 수 있음

				if (cards1Index < cards1.length && cards1[cards1Index].equals(goal[i])) {
					cards1Index++;
				}
				
				else if (cards2Index < cards2.length && cards2[cards2Index].equals(goal[i])) {
					
					cards2Index++; 
				}
				else {
					answer = "No";
					break;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		
		System.out.println(Solution.solution(cards1, cards2, goal));

	}

}
