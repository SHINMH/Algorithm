package 프로그래머스.Level1.자릿수더하기;

public class Main {
    public static void main(String[] args) {
        int N = 123;
        int sum = 0;

        char[] numbers = Integer.toString(N).toCharArray();

        for(char num : numbers){
            sum += Character.getNumericValue(num);
        }
    }
}
