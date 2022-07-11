package BOJ.BOJ_3079;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 입국 심사대 수
        int M = Integer.parseInt(st.nextToken()); // 인원 수

        int[] array = new int[N];

        long min = 1;
        long max = 0;

        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, array[i]);
        }
        max = max * M;

        long sum = 0;
        long mid;
        long answer = max;

        while(min <= max){
            mid = (min + max) / 2;
            sum = 0;
            for(int i = 0; i < N; i++){
                sum += mid / array[i];
            }
            if(sum >= M && answer > mid){
                answer = mid;
            }

            if(sum >= M){
                max = mid - 1;
            }else { // sum < M
                min = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
