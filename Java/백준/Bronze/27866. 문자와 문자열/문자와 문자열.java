import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        // 자바 문자열 인덱스는 0부터 시작하기 때문에 -1 해줌
        int n = sc.nextInt()-1;

        System.out.println(st.charAt(n));
    }
}
