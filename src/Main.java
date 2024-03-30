import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    private static int n, k;
    private static ArrayList<Integer> a = new ArrayList<>();
    public static void main(String[] args) {

        n = scan.nextInt();

        k = scan.nextInt();

        for(int i = 0; i < n; i++) {
            a.add(1);
        }

        rec(0);
    }

    public static void rec(int i){
        if (i == n){
            System.out.println(a);
            return;
        }
        for(int j = 1; j <= k; j++){
            a.set(i, j);
            rec(i+1);
        }
    }
}