import java.io.*;
import java.util.*;
//백준 2667번 단지번호 붙이기
public class AddComplexNumber {

    static int N;
    static char[][] apt;
    static boolean[][] isSearched;
    static int[] dx = {0, 0, -1, 1}; // 상하좌우 이동
    static int[] dy = {-1, 1, 0, 0};
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt(); // 단지 크기
        scanner.nextLine(); // 버퍼 초기화
        
        apt = new char[N][N]; // 단지 상태
        isSearched = new boolean[N][N]; // 탐색 여부
        
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < N; j++) {
                apt[i][j] = input.charAt(j);
            }
        }
        
        ArrayList<Integer> complexes = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (apt[i][j] == '1' && !isSearched[i][j]) {
                    complexes.add(dfs(i, j)); // 한 그룹내 단지 수를 추가
                }
            }
        }
        
        Collections.sort(complexes);
        System.out.println(complexes.size());
        for (int count : complexes) {
            System.out.println(count);
        }
        
        scanner.close();
    }
    
    
    
    
    
    public static int dfs(int x, int y) {
        Stack<int[]> stack = new Stack<>(); // 배열을 스택의 제너릭으로 설정
        stack.push(new int[]{x, y});
        isSearched[x][y] = true;
        int count = 0;
        
        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            count++;
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (apt[nx][ny] == '1' && !isSearched[nx][ny]) {
                        stack.push(new int[]{nx, ny});
                        isSearched[nx][ny] = true;
                    }
                }
            }
        }
        
        return count;
    }
}
