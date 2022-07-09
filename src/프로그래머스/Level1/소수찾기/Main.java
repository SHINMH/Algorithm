package 프로그래머스.Level1.소수찾기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;

        int[] checkPrime = new int[n + 1];

        for(int i = 2; i * i <= n; i++){
            if(checkPrime[i] == 0){

                int j = 2;
                while(i * j <= n){
                    checkPrime[i * j] = 1;
                    j++;
                }
            }
        }

        for(int i = 2; i <= n; i++){
            if(checkPrime[i] == 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
