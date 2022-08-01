package 프로그래머스.Level1.문자열내마음대로정렬하기;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static String[] solution(String[] strings, int n){
        String[] answer = {};

        answer = Arrays.stream(strings).sorted((o1, o2) -> {
            if(o1.charAt(n) - o2.charAt(2) == 0) return o1.compareTo(o2);
            else return o1.charAt(n) - o2.charAt(2);
        }).toArray(String[]::new);

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"abce", "abcd", "cdx"}, 2);
    }
}
