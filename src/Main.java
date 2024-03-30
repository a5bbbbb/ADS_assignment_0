import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scan.nextInt();
        rec(n);
    }
    public static void rec(int n){
        if (n < 1)return;
        String a = scan.nextLine();
        rec(n-1);
        System.out.println(a);
    }
}