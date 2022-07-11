package 프로그래머스.Level1.제일작은수제거하기;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] answer = {};

        List<Integer> list = new LinkedList<Integer>();

        if(arr.length == 1) answer = new int[]{10};
        else {

            int minNum = Arrays.stream(arr).min().orElse(0);
            answer = Arrays.stream(arr).filter(integer -> minNum != integer).toArray();

            System.out.println(Arrays.toString(answer));
        }
    }
}
