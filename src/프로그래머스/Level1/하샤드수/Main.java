package 프로그래머스.Level1.하샤드수;

public class Main {
    public static void main(String[] args) {
        int x = 11;
        boolean answer = false;
        int sum = 0;
        int xCopy = x;

        while(xCopy > 0){
            sum += xCopy % 10;
            xCopy /= 10;
        }

        if(x % sum == 0) answer = true;

        System.out.println(answer);
    }
}
