package 토스;

public class Main1 {
    public static int solution(String s) {
        int answer = -1;

        String[] strArray = new String[]{
                "000","111", "222", "333", "444", "555", "666", "777", "888", "999"
        };

        for(int i = 0; i < 10; i++){
            if(s.contains(strArray[i])){
                answer = Integer.parseInt(strArray[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("");
    }
}
