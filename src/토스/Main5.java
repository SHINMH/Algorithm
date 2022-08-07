package 토스;

import java.util.*;

public class Main5 {
    public int solution(int[] tasks) {
        int answer = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : tasks){
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        for(int i : hashMap.values()){
            if(i == 1){
                return -1;
            }

            if(i % 3 == 0){
                answer += i / 3;
            } else if(i % 3 == 1 || i % 3 == 2){
                answer += i / 3 + 1;
            }
        }

        return answer;
    }

//    public Map<String, Long> countMessages(List<String> messages) {
//        return messages.stream()
//                .collect(groupingBy(Function.identity(), counting()));
//    }

    public static void main(String[] args) {


    }
}
