package 프로그래머스.Level1.나머지가1이되는수찾기;

public class Main {
    public static int solution(int n) {
        int answer = 0;
        int i = 2;

        while(i < n){
            if(n % i == 1){
                answer = i;
                break;
            }
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(10);
    }
}
