import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            a.add(scan.nextInt());
        }

        rec(n, a);
    }
    public static void rec(int n, ArrayList<Integer> a){
        if (n < 15)return;
        System.out.print(a.get(n-1));
        System.out.print(' ');
        rec(n-1, a);
    }
}