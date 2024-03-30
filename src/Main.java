import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(rec(n, b));
    }
    public static long rec(int n, int b){
        if (n <= 0)return 1;
        return rec(n-1, b)*b + 1;
    }
}