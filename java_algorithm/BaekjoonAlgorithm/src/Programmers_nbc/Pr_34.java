package Programmers_nbc;
import java.util.*;

public class Pr_34 {
	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12917
	
	class Solution{
		public static String solution(String s) {

			ArrayList<Character> ls = new ArrayList<>();
			for(int i=0;i<s.length();i++) {
				ls.add(s.charAt(i));
				
			}
			
			Collections.sort(ls, Comparator.reverseOrder());
			StringBuilder answer = new StringBuilder();
		
			for(char c : ls) {
				answer.append(c);
			}
			
			return answer.toString();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.valueOf(Solution.solution("Zbcdefg")));

	}

}
