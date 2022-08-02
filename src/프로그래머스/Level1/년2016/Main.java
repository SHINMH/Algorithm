package 프로그래머스.Level1.년2016;

public class Main {
    public static String solution(int a, int b) {
        String answer = "";

        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

        int dayB = b;

        for(int i = 0; i < a - 1; i++){
            dayB += month[i] % 7;
        }

        answer = day[dayB % 7];

        return answer;
    }

    public static void main(String[] args) {
        solution(1, 1);
    }
}
