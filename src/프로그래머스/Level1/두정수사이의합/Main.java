package 프로그래머스.Level1.두정수사이의합;

public class Main {
    public static long solution(int a, int b) {
        long answer = 0;

        if(b <a){
            int temp = b;
            b = a;
            a = temp;
        }

        for(int i = a; i <=b; i++){
            answer += i;
        }

        return answer;
    }


    public static void main(String[] args) {
        solution(10, 20);
    }
}
