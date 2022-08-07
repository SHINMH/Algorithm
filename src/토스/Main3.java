package 토스;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main3 {
    public static int solution(int k, int[][] dungeons) {
        int answer = 0;






        return answer;
    }

    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }


    public static void main(String[] args) {
        solution(80, new int[][]{{80,20}, {50,40}, {30,10}});
    }
}
