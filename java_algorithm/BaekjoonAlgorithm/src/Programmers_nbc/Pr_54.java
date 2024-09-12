package Programmers_nbc;

import java.util.Scanner;

import java.util.Arrays;

public class Pr_54 {
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12901
	// 2016년 1월 1일 = 금요일 (윤년 : 2월 == 29일)
	public static String solution(int a, int b) {
		String answer = "";

		int[] days = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 1; i < days.length; i++) {
			days[i] = days[i - 1] + days[i];
		}

		switch ((days[a - 1] + b - 1) % 7) { // 시작일이 0이 아니라 1부터 시작이므로 -1 해줌
		case 0:
			answer = "FRI";
			break;
		case 1:
			answer = "SAT";
			break;
		case 2:
			answer = "SUN";
			break;
		case 3:
			answer = "MON";
			break;
		case 4:
			answer = "TUE";
			break;
		case 5:
			answer = "WED";
			break;
		case 6:
			answer = "THU";
			break;
		}

		System.out.println(Arrays.toString(days));
		return answer;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();

		System.out.println(solution(month, day));
		scanner.close();
	}

}
