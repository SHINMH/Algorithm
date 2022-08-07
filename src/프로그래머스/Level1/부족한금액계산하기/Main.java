package 프로그래머스.Level1.부족한금액계산하기;

public class Main {
    public static long solution(int price, int money, int count) {
        long answer = -1;

        // 3, 6 ,9, 12
        long total = 0;
        for(int i = 1; i <= count; i++){
            total += price * i;
        }
        answer = money - total > 0 ? 0 : Math.abs(money - total);

        return answer;
    }

    public static void main(String[] args) {
        solution(3, 30, 4);
    }
}
