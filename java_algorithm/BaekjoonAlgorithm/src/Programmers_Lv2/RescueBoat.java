package Programmers_Lv2;

import java.util.Arrays;

public class RescueBoat {

	//https://school.programmers.co.kr/learn/courses/30/lessons/42885

	class Solution {
		public static int solution(int[] people, int limit) {
			int answer = 0;

			Arrays.sort(people);

			int light = 0; // 가장 가벼운 사람의 인덱스
			int heavy = people.length - 1; // 가장 무거운 사람의 인덱스

			while (light <= heavy) {
				if (people[light] + people[heavy] <= limit) {
					light++; // 가벼운 사람 태움
					// 한 보트에 최대 2명 까지 탈 수 있는 조건이 있다.
				}
				// 가장 무거운 사람은 항상 태움
				heavy--;
				answer++; // 보트 사용 횟수 증가
			}

			return answer;
		}
	}


	public static void main(String[] args) {
		int limit = 100;
		int[] people = {70,50,80,50};
		System.out.println(Solution.solution(people, limit));
	}
}
