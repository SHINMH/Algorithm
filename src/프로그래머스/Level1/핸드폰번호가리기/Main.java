package 프로그래머스.Level1.핸드폰번호가리기;

public class Main {
    public static void main(String[] args) {
        String phone_number = "01033334444";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < phone_number.length() - 4; i++){
            sb.append("*");
        }
        sb.append(phone_number.substring(phone_number.length() - 4));

        System.out.println(sb.toString());
    }
}
