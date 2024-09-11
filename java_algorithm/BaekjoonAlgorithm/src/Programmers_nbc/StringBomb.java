package Programmers_nbc;

import java.io.*;
// https://www.acmicpc.net/problem/9935
import java.util.*;

public class StringBomb {

	public static void setString(char[] c1, char[] c2) {
		Stack<Character> stack = new Stack<>();
		
		// stack.size() : 현재 스택 요소의 개수
		// stack.capac;ity(); 스택 최대 크기 (동적으로 확장되거나 축소됨)
		

		for (int i = 0; i < c1.length; i++) {
			stack.push(c1[i]);
			if (stack.size() >= c2.length) {
				boolean flag = true;

				for (int j = 0; j < c2.length; j++) {
					if (stack.get(stack.size() - c2.length + j) != c2[j]) {
						flag = false; // 하나라도 일치하지 않으면 반복문 탈출
						break;
					}
				}
				if (flag) { // 만약 모두 일치하는 경우 (pop)
					for (int k = 0; k < c2.length; k++) {
						stack.pop();
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(Character c : stack) {
			sb.append(c);
		}
		System.out.println(sb.length() == 0 ? "FRULA" : sb.toString());

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String bomb = br.readLine();

		char[] c1 = str.toCharArray();
		char[] c2 = bomb.toCharArray();

		setString(c1, c2);

		br.close();
	}

}
