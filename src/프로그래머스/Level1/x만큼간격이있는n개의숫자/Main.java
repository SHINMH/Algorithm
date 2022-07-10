package 프로그래머스.Level1.x만큼간격이있는n개의숫자;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long[] answer = {};
        List<Long> list = new LinkedList<>();

        for(int i = 1; i <=n; i++){
            list.add((long)(x * i));
        }

        answer = list.stream().mapToLong(Long::longValue).toArray();


        System.out.println(answer);
    }
}
