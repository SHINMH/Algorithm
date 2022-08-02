package 프로그래머스.Level1.최소직사각형;

public class Main {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int height = 0;
        int width = 0;

        for(int[] size : sizes){
            if(size[0] < size[1]){
                height = Math.max(height, size[0]);
                width = Math.max(width, size[1]);
            }else {
                height = Math.max(height, size[1]);
                width = Math.max(width, size[0]);
            }
        }

        System.out.println(height * width);

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
    }
}
