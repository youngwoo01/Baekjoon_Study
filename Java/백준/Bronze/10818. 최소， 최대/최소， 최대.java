import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받을 숫자의 개수 n을 읽음
        int n = sc.nextInt();

        // n개의 정수를 저장할 배열 생성
        int[] arr = new int[n];

        // 배열의 길이만큼 반복하면서 숫자를 하나씩 입력받아 배열에 저장
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // 최소값과 최대값을 배열의 첫 번째 값으로 초기화
        int min = arr[0];
        int max = arr[0];

        // 배열 전체를 다시 순회하면서 최소값과 최대값을 찾음
        for (int i=0; i<arr.length; i++){
            // 현재 값이 min보다 작으면 min 갱신
            if (min > arr[i]) {
                min = arr[i];
            }
            // 현재 값이 max보다 크면 max 갱신
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // 최소값과 최대값을 공백으로 구분해서 출력
        System.out.println(min+" "+max);
    }
}