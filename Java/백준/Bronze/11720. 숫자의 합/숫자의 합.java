import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // 숫자들을 문자열 형태로 입력받음
        String a = sc.next();

        int sum = 0;

        for (int i=0; i<n; i++){
            // a.charAt(i)는 문자(char)이므로
            // '0'을 빼서 실제 숫자값으로 변환
            sum += a.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
