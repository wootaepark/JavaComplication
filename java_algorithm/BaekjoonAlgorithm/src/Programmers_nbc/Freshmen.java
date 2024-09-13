package Programmers_nbc;

import java.util.*;
import java.io.*;

// 링크 : https://www.acmicpc.net/problem/1946

public class Freshmen {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine()); // 지원자의 수
			int[][] arr = new int[N][2];

			// 각 지원자 점수 입력받기
			for (int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[j][0] = Integer.parseInt(st.nextToken()); // 서류 순위
				arr[j][1] = Integer.parseInt(st.nextToken()); // 면접 순위

			}
			Arrays.sort(arr, Comparator.comparingInt(a -> a[0])); // 서류 순위 정렬 (오름차순)
			// 여기까지가 입력 및 정렬
			

			int count = 1; // 합격자 수
			int max = arr[0][1]; // 해당 사람의 면접순위
			
			for (int j = 1; j < arr.length; j++) {
				if(arr[j][1] < max) {
					count ++;
					max = arr[j][1];
				}
				
			}
			
			System.out.println(count);

		}
		// 여기 까지가 입력 및 정렬

	}

}
