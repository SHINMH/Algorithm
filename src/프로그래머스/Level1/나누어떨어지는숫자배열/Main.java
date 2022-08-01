package 프로그래머스.Level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};

        for(int i : arr){
            if(i % divisor == 0) list.add(i);
        }

        answer = list.stream().mapToInt(Integer::intValue).sorted().toArray();

        if(answer.length == 0) return new int[]{-1};

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{5, 9, 7, 10}, 5);
    }
}
