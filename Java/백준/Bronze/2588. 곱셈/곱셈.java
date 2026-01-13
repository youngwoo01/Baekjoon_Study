import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        String s = sc.next();
        
        System.out.println(a * (s.charAt(2)-'0'));
        System.out.println(a * (s.charAt(1)-'0'));
        System.out.println(a * (s.charAt(0)-'0'));
        System.out.println(a*Integer.parseInt(s));
    }
}