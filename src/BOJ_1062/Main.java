package BOJ_1062;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] strList = new int[N][26];
        int[] strCount = new int[N];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++){
                if(strList[i][str.charAt(j) - 'a'] != 1){
                    strList[i][str.charAt(j) - 'a'] = 1;
                    strCount[i]++;
                }
            }
        }

        int[] array = new int[26];
        array['a' - 'a'] = 1;
        array['n' - 'a'] = 1;
        array['t' - 'a'] = 1;
        array['i' - 'a'] = 1;
        array['c' - 'a'] = 1;
        int count = M - 5;

        if(M >= 5){
            for(int i = 0; i < N; i++){


            }
        }else{
            System.out.println(0);
        }
    }
}
