package Programmers_nbc;

import java.util.*;
import java.io.*;

// 다익스트라 알고리즘을 활용한 문제풀이
// 링크 : https://www.acmicpc.net/problem/1753

public class ShortestPath {
	
	
	public static void dijkstra() {
		
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken()); // 정점의 개수
		int E = Integer.parseInt(st.nextToken()); // 간선의 개수

		System.out.println("V=" + V + " E=" + E);

		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken()); // 시작 정점

		System.out.println("K=" + K);

		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			
		}

		br.close();

	}

}
