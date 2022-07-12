package 프로그래머스.Level1.수박수박수박수박수박수;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n / 2; i++){
            sb.append("수박");
        }
        if(n % 2 == 1) sb.append("수");

        System.out.println(sb.toString());
    }
}
