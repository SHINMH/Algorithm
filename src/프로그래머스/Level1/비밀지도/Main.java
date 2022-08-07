package 프로그래머스.Level1.비밀지도;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        List<String> list = new LinkedList<>();

        for(int i = 0; i < arr1.length; i++){
            int num1 = arr1[i];
            int num2 = arr2[i];
            char[] temp = new char[n];
            Arrays.fill(temp, ' ');
            for(int j = n - 1; j >= 0; j--){
                if(num1 >= Math.pow(2, j)){
                    temp[n - 1 - j] = '#';
                    num1 -= Math.pow(2, j);
                }

                if(num2 >= Math.pow(2, j)){
                    temp[n - 1 - j] = '#';
                    num2 -= Math.pow(2, j);
                }
            }
            list.add(new String(temp));
        }

        answer = list.toArray(String[]::new);

        return answer;
    }

    public static void main(String[] args) {
        solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});
    }
}
