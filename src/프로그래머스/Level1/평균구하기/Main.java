package 프로그래머스.Level1.평균구하기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println((double)Arrays.stream(arr).sum() / arr.length);
    }
}
