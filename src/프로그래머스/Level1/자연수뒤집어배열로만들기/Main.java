package 프로그래머스.Level1.자연수뒤집어배열로만들기;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long n = 12345;
        int[] answer = {};

        List<Integer> list = new LinkedList<>();

        while(n > 0){
            list.add((int) (n % 10));
            n /= 10;
        }

        answer = list.stream().mapToInt(value -> value).toArray();
    }
}
