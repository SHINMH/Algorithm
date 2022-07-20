package 프로그래머스.Level1.문자열다루기기본;

public class Main {
    public static boolean solution(String s) {
        boolean answer = true;
        char[] list = s.toCharArray();

        if(s.length() < 4 || s.length() > 6){
            answer = false;
        }else {
            for(char word : list){
                if(word < '0' || word > '9'){
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a234"));
    }
}
