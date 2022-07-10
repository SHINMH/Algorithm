package 프로그래머스.Level1.예산;

import java.util.Arrays;

public class Main {
     public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int count = 0;
        int sum = 0;

        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            if(sum + d[i] <= budget){
                count++;
                sum += d[i];
            }else {
                break;
            }
        }

         System.out.println(count);
    }
}
