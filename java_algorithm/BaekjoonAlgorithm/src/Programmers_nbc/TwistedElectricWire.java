package Programmers_nbc;

import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1365
public class TwistedElectricWire {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 전봇대의 개수

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 입력 끝

		// LIS(Longest Increasing Subsequence) 구하기

		int[] lis = new int[N];
		lis[0] = arr[0];
		int index = 0;

		for (int i = 1; i < N; i++) {
			if (lis[index] < arr[i]) {

				lis[++index] = arr[i];

			} else {
				int targetIndex = binarySearch(lis, arr[i], index);
				lis[targetIndex] = arr[i];

			}
		}

		System.out.println(N - (index + 1)); // index + 1 이 완성된 배열의 길이

	}
	
	static int binarySearch(int[] arr,  int target, int end) {
		// 약간은 좀 특별한 이분 탐색
		// 완전히 일치하는 것은 존재 x (문제 사항) 그래서 위치를 특정하는 것이 핵심
		
		int start = 0;

		while (start <= end) {
			
			int mid = (start + end) / 2;
			if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1; 
				// 또는 end = mid 로 하면 위 while 조건을 (start < end) 로 변경해야함
			}
		}
		
		return start;
	}

}
