import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(rec(n));
    }
    public static long rec(int n){
        if (n <= 0)return 0;
        return rec(n-1) + (long) n * n;
    }
}