import java.io.*;
import java.util.*;
public class SortingArray {
    // 백준 11651번 문제 : 좌표 정렬하기 2

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        
        
        Arrays.sort(array, new Comparator<int[]>() {
            @Override // compare 오버라이드 적어 주는 것이 좋은 습관
            
            //필수 오버라이딩 해야한는 함수 compare
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return Integer.compare(o1[0], o2[0]);
                }
                return Integer.compare(o1[1], o2[1]);
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(array[i][0] + " " + array[i][1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
