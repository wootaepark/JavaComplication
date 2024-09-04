import java.util.*;

public class TriangleTest {

	// 정삼각형 그리기 테스트

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("몇줄을 출력하고 싶으신가요? >>");

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		// (1,1), (2,3), (3,5), (4,7) ...
		int max_size = 1 + 2 * (n - 1); // 최종적으로 만들어 지는 정사각형의 크기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < max_size; j++) { // 빈 삼각형 조건
				if (i == n - 1) {
					if (j % 2 == 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

					continue;
				}

				if ((max_size / 2 - i == j || max_size / 2 + i == j)) {
					// if(max_size/2 -i<= j || max_size/2+i >= j) // 이것은 내부 삼각형 모두 체우는 조건
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

		scanner.close();

	}

}
