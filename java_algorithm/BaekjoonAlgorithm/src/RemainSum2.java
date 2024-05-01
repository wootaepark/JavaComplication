import java.io.*;
import java.util.*;


// 10986 번 정답
public class RemainSum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] counts = new long[M];
        long[] S = new long[N];
        long result = 0;

        
        st = new StringTokenizer(br.readLine());
        S[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
        	S[i] = S[i-1]+Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < N; i++) {
        	int remainder = (int)(S[i]%M);
        	if(remainder % M == 0) result++;
        	counts[remainder]++;
        }

        // 같은 나머지 값을 가진 누적합 인덱스의 조합 수 계산
        
        for (int i = 0; i < M; i++) {
            if (counts[i] > 1) {
                result += (counts[i] * (counts[i] - 1)) / 2;
            }
        }

        System.out.println(result);
        br.close();
    }
}
