import java.util.*;
public class CountOpt {
    public static int Count(int n){
        int cnt= (int)(Math.log10(n)+1);
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = Count(n);
        System.out.println(count);
    }
}
