package Programmers_nbc;

public class Pr_62 {

    static class Solution {
        public static int solution(String[] babbling) {
            int answer = 0;
            String[] canBabbling = { "aya", "ye", "woo", "ma" };

            // 각 발음할 수 있는 단어를 반복해서 제거한 후 남은 문자열이 없으면 발음 가능
            for (String word : babbling) {
                String temp = word;
                
                // 연속된 같은 발음이 있는지 확인
                for (String babble : canBabbling) {
                    if (temp.contains(babble + babble)) {
                        temp = null; // 연속 발음이 있으면 해당 단어는 발음 불가능
                        break;
                    }
                }
                
                if (temp != null) {
                    // 발음 가능한 단어를 모두 제거
                    for (String babble : canBabbling) {
                        temp = temp.replaceAll(babble, " ");
                    }

                    // 공백을 모두 제거한 후 아무것도 남지 않으면 발음 가능
                    if (temp.trim().isEmpty()) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        String[] babbling = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa" };
        System.out.println(Solution.solution(babbling)); // 출력: 2
    }
}
