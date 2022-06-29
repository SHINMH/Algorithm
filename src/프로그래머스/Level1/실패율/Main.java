package 프로그래머스.Level1.실패율;
import java.util.*;

public class Main {
    static class Stage {
        int number;
        float failRate;

        public Stage(int number, float failRate){
            this.number = number;
            this.failRate = failRate;
        }
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] unClearCount = new int[N + 2];
        int[] tryCount = new int[N + 2];

        Arrays.fill(unClearCount, 0);
        Arrays.fill(tryCount, 0);

        for(int i = 0; i < stages.length; i++){
            unClearCount[stages[i]]++;
            for(int j = 1; j <= stages[i]; j++){
                tryCount[j]++;
            }
        }

        List<Stage> list = new LinkedList();
        for(int i = 1; i < N + 1; i++){
            list.add(new Stage(i, (tryCount[i] != 0 ? (float)unClearCount[i] / tryCount[i] : 0)));
        }

        list.sort((o1, o2)-> {
            if(Float.compare(o2.failRate, o1.failRate) == 0) {
                return o1.number - o2.number;
            }else {
                return Float.compare(o2.failRate, o1.failRate);
            }
        });

        answer = list.stream().mapToInt(stage -> stage.number).toArray();

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        solution(4, new int[]{4,4,4,4,4});
        solution(4, new int[]{1});
    }
}
