package Programmers_nbc;

import java.util.*;

public class StackArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		Stack<Integer> stack = new Stack<>();

		StringBuffer result = new StringBuffer();

		int num = 1; // 순차적 스택 push 를 위한 변수
		for (int i = 0; i < arr.length; i++) {

			int data = arr[i]; // 현재 수열의 정수
			
			if (data >= num) { 
				while (data >= num) {
					stack.push(num++);
					result.append("+\n");
				}
				stack.pop();
				result.append("-\n");
			}
			else {
				int n = stack.pop();
				
				if(n > data) { // pop 된 수가 현재 인덱스의 수보다 큰 경우 (조건 불만족)
					System.out.println("NO");
					System.exit(0);
				}
				else {
					result.append("-\n");
				}
			}

		}
		
		System.out.println(result.toString());

		scanner.close();

	}

}
