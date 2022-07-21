package 프로그래머스.Level1.문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static String solution(String s) {
        String answer = "";

        String[] sArray = s.split("");

        Arrays.sort(sArray, Collections.reverseOrder());

        answer = String.join("", sArray);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
