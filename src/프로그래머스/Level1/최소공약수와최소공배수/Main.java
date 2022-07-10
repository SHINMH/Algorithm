package 프로그래머스.Level1.최소공약수와최소공배수;

public class Main {

    public static int GCD(int a, int b){
        if(a % b == 0) return b;

        return GCD(b, a % b);
    }

    public static int LCM(int a, int b){

        GCD(a, b);

        return 0;
    }

    public static void main(String[] args) {
        int[] answer = new int[2];
        int n = 3, m = 12;

        answer[0] = GCD(n, m);
        answer[1] = n * m /  answer[0];

        System.out.println(GCD(10, 12));
    }
}
