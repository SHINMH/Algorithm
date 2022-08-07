package 프로그래머스.Level1.가운데글자가져오기;

public class Main {
    public static String solution(String s) {
        String answer = "";

        int center = s.length() / 2;
        if(s.length() % 2 == 0){
            answer = s.substring(center - 1, center + 1);
        }else {
            answer = s.substring(center, center + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("abcde");
        solution("qwer");
    }
}
