import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 몇 칸으로 저장할거냐
        int arr[] = new int[9];

        // 배열에 저장할 값을 저장해야함
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 최대 값을 저장할 변수
        int max = 0;
        // 최대 값 몇번 째인지 저장할 변수
        int index = 0;
        // 현재 몇번 째인지 알 수 있는 변수
        int count = 0;

        for(int value : arr){
            count++;
            if(value > max){
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}