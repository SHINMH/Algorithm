package 프로그래머스.Level1.이상한문자만들기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "try hello world";
        char[] sArr = s.toCharArray();
        int flag = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] == ' '){
                sb.append(sArr[i]);
                flag = 1;
            }else if(flag == 1){
                sb.append(Character.toUpperCase(sArr[i]));
                flag *= -1;
            }else {
                sb.append(Character.toLowerCase(sArr[i]));
                flag *= -1;
            }
        }

        System.out.println(sb.toString());
    }
}
