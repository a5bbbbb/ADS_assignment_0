import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int[] a = {1,2,3,4,5,6,7};
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(rec(n));
    }
    public static long rec(int n){
        if (n <= 0)return 0;
        return rec(n-1) + a[n-1];
    }
}