
import java.util.*;
// 백준 2805 : 나무자르기 
public class CutTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 나무의 수
        int M = scanner.nextInt(); // 가져가야 할 나무의 길이 

        int[] woods = new int[N];

        for (int i = 0; i < N; i++) {
            woods[i] = scanner.nextInt(); // 각 나무의 높이 정보
        }

        // 이진 탐색을 위한 변수 초기화
        int low = 0;
        int high = Arrays.stream(woods).max().getAsInt();
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            long sum = 0;

            for (int i = 0; i < N; i++) {
                if (woods[i] > mid) {
                    sum += woods[i] - mid;
                }
            }

            // 필요한 나무의 길이보다 더 많이 잘랐으면 높이를 높여봄
            if (sum >= M) {
                result = mid;
                low = mid + 1;
            } 
            // 필요한 나무의 길이보다 적게 잘랐으면 높이를 낮춤
            else {
                high = mid - 1;
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
