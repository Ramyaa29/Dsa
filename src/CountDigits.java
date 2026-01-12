import java.util.Scanner;
public class CountDigits {
    public static int Count(int n){
        int cnt=0;
        while(n>0){
            cnt=cnt+1;
            n=n/10;
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digits = Count(N);
        System.out.println(digits);
    }
}
