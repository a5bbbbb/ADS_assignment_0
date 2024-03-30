import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    private static int n;
    private static final ArrayList<ArrayList<Integer>> m = new ArrayList<>();
    private static final int[] dX = {1, 0, -1, 0};
    private static final int[] dY = {0, 1, 0, -1};
    public static void main(String[] args) {

        n = scan.nextInt();

        for(int i = 0; i < n; i++) {

            m.add(new ArrayList<>());

            for (int j = 0; j < n; j++)

                m.get(i).add(0);
        }
        fillSpiral(0, 0, 1, 0);
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m.get(i).get(j));
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }

    public static void fillSpiral(int y, int x, int t, int direction){
        m.get(y).set(x, t);

        switch (direction){
            case 0:
                if(x == n - 1 || x < n - 1 && m.get(y).get(x+1) != 0)
                    direction++;
                break;
            case 1:
                if(y == n - 1 || y < n - 1 && m.get(y+1).get(x) != 0)
                    direction++;
                break;
            case 2:
                if(x == 0 || x > 0 && m.get(y).get(x-1) != 0)
                    direction++;
                break;
            case 3:
                if(y > 0 && m.get(y-1).get(x) != 0)
                    direction = 0;
                break;
        }

        int toX = x + dX[direction];
        int toY = y + dY[direction];

        if (toX >= 0 && toX < n && toY >= 0 && toY < n && m.get(toY).get(toX) == 0)
            fillSpiral(toY, toX, t+1, direction);

    }
}