package KMP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();
        char[] pattern = br.readLine().toCharArray();

        int tLength = text.length;
        int pLength = pattern.length;

        int[] fail = new int[pLength];
        for(int i = 1, j = 0; i < pLength; i++){
            while(j > 0 && pattern[i] != pattern[j]){
                j = fail[i - 1];
            }
            if(pattern[i] == pattern[j]) fail[i] = ++j;
        }

        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0, j = 0; i < tLength; i++){
            while(j > 0 && text[i] != pattern[j]){
                j = fail[j - 1];
            }

            if(text[i] == pattern[j]){
                if(j == pLength - 1){
                    cnt++;
                    list.add((i + 1) - pLength + 1);
                    j = fail[j];
                }else{
                    j++;
                }
            }
        }

        if(cnt>0) {
            System.out.println(list);
        }
    }
}
