package KMP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str2 = br.readLine();

        System.out.println(str.contains(str2) ? 1 : 0);
    }
}
