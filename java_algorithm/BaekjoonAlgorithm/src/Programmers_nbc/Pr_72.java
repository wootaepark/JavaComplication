package Programmers_nbc;

import java.util.*;

public class Pr_72 {
	//https://school.programmers.co.kr/learn/courses/30/lessons/178871

	class Solution {
		public static String[] solution(String[] players, String[] callings) {
			// 플레이어 이름 -> 순위
			HashMap<String, Integer> nameToRank = new HashMap<>();
			// 순위 -> 플레이어 이름
			HashMap<Integer, String> rankToName = new HashMap<>();

			// 초기 플레이어 리스트를 두 개의 map에 저장
			for (int i = 0; i < players.length; i++) {
				nameToRank.put(players[i], i);   // 플레이어 이름 -> 순위
				rankToName.put(i, players[i]);   // 순위 -> 플레이어 이름
			}

			// callings 배열을 순회하면서 호출된 플레이어의 순서를 업데이트
			for (String calling : callings) {
				int currentRank = nameToRank.get(calling); // 현재 호출된 플레이어의 순위
				int newRank = currentRank - 1; // 한 칸 앞으로 가야 함

				// 현재 순위에서 한 칸 앞에 있는 플레이어 찾기
				String otherPlayer = rankToName.get(newRank);

				// 두 플레이어의 순서를 교체
				nameToRank.put(calling, newRank);
				nameToRank.put(otherPlayer, currentRank);

				rankToName.put(newRank, calling);
				rankToName.put(currentRank, otherPlayer);
			}

			// 순위에 맞춰 플레이어 이름을 배열로 변환
			String[] answer = new String[players.length];
			for (int i = 0; i < players.length; i++) {
				answer[i] = rankToName.get(i);
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		String[] players = { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = { "kai", "kai", "mine", "mine" };
		System.out.println(Arrays.toString(Solution.solution(players, callings)));
	}
}
