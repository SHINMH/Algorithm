package 프로그래머스.Level1.콜라츠추측;

public class Main {
    public static void main(String[] args) {
        long num = 626331;
        int count = 0;
        int answer = 0;

        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }else {
                num = num * 3 + 1;
            }
            count++;
            if(count >= 500) break;
        }

        if(num != 1) count = -1;

        answer = count;

        System.out.println(answer);
    }
}
