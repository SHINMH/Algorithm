package 프로그래머스.Level1.같은숫자는싫어;

import java.util.*;

public class Main {
    public static int[] solution(int []arr) {
        int[] answer = {};
        LinkedList<Integer> list = new LinkedList<>();

        for(int num : arr){
            if(list.isEmpty()){
                list.add(num);
            } else if(list.getLast() != num){
                list.add(num);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,1,3,3,0,1,1});
    }
}
