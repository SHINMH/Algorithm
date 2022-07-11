package 프로그래머스.Level1.정수제곱근판별;

public class Main {
    public static void main(String[] args) {
        long n = 3;
        long answer = 0;
        long num = 0;

        num = (long) Math.sqrt(n);

        if(num * num == n){
            answer = (num + 1) * (num + 1);
        }else {
            answer = -1;
        }

        System.out.println(answer);
    }
}
