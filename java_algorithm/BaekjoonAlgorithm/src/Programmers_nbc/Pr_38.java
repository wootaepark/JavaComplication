package Programmers_nbc;

import java.util.Scanner;

public class Pr_38 {
	
	// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12969

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		//System.out.println(a + b);
		sc.close();

	}

}
