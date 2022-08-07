package 토스;

import java.util.Arrays;

public class Main2 {

    public static int solution(int[] levels) {
        int answer = 0;

        Arrays.sort(levels);

        int index = levels.length / 4;

        if(levels.length < 3) return -1;

        System.out.println(levels[levels.length - index]);

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,5,6,7,8,9});
    }
}
