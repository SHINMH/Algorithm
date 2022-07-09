package 프로그래머스.Level1.두개뽑아서더하기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,1,3,4,1};
        int[] answer = {};
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = set.stream().mapToInt(value -> value).toArray();

        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));
    }
}
