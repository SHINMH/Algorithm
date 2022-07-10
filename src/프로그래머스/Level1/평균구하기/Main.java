package 프로그래머스.Level1.평균구하기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        sum / arr.length

        System.out.println((double)Arrays.stream(arr).average().orElse(0);

    }
}
