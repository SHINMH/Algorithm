package 프로그래머스.Level1.시저암호;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "a B z";
        String answer = "";
        int n = 4;
        char[] sArray = s.toCharArray();

        for(int i = 0; i < sArray.length; i++) {
            if (sArray[i] >= 65 && sArray[i] <= 90) {
                sArray[i] = sArray[i] + n > 90 ? (char)(((sArray[i] + n) % 91) + 65) : (char)(sArray[i] + n);
            } else if (sArray[i] >= 97 && sArray[i] <= 122) {
                sArray[i] = sArray[i] + n > 122 ? (char)(((sArray[i] + n) % 123) + 97) : (char)(sArray[i] + n);
            }
        }
        answer = String.valueOf(sArray);
        System.out.println(answer);
    }
}
