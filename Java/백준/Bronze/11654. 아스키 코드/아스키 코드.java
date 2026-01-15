import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 하나를 입력받고(next()),
        // 그 문자열의 첫 번째 문자(charAt(0))를 꺼냄
        // char는 내부적으로 정수(int) 값으로 저장되므로
        // int 변수 ch에 저장 가능
        int ch = sc.next().charAt(0);

        // ch에 저장된 값은 '문자 자체'가 아니라
        // 해당 문자의 정수 코드값(아스키/유니코드)
        System.out.println(ch);
    }
}
