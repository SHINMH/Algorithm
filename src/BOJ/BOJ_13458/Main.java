package BOJ.BOJ_13458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] people = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            people[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long count = 0;
        long Ccount = 0;

        for(int i = 0; i < N; i++){
            count = count + 1;
            if((people[i] - B) > 0){
                Ccount = ((people[i] - B) % C) > 0 ? (people[i] - B) / C + 1 : (people[i] - B) / C;
                count += Ccount;
            }
        }

        System.out.print(count);
    }
}
