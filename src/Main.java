import java.util.*;

public class Main {
    public static void main(String[] argc) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] x1 = new int[size];
        int[] x2 = new int[size];
        int[] y1 = new int[size];
        int[] y2 = new int[size];
        int[] r1 = new int[size];
        int[] r2 = new int[size];

        for (int i = 0; i < size; ++i) {
            x1[i] = input.nextInt();
            y1[i] = input.nextInt();
            r1[i] = input.nextInt();
            x2[i] = input.nextInt();
            y2[i] = input.nextInt();
            r2[i] = input.nextInt();
        }

        double[] distance = new double[size];

        for (int i = 0; i < size; ++i) {
            distance[i] = Math.sqrt(Math.abs(x2[i] - x1[i]) * Math.abs(x2[i] - x1[i])
                    + Math.abs(y2[i] - y1[i]) * Math.abs(y2[i] - y1[i]));
        }


        for (int i = 0; i < size; ++i) {
            if (r1[i] < 0 || r1[i] > 10000 || r2[i] < 0 || r2[i] > 10000) {
                continue;
            } else if (-10000 < x1[i] && x1[i] < 10000 && -10000 < y1[i] && y1[i] < 10000
                    && -10000 < x2[i] && x2[i] < 10000 && -10000 < y2[i] && y2[i] < 10000) {
                if ( x1[i] == x2[i] && y1[i] == y2[i] && r1[i] == r2[i]) {
                    System.out.println(-1);
                }else if ( distance[i] > (r1[i] + r2[i]) || distance[i] < (Math.abs(r1[i] - r2[i]))) {
                    System.out.println(0);
                }else if ( (Math.abs(r1[i] - r2[i])) < distance[i] && distance[i] < (r1[i] + r2[i]) ) {
                    System.out.println(2);
                }else if ( distance[i] == (r1[i] + r2[i]) || distance[i] == (Math.abs(r1[i] - r2[i])) ) {
                    System.out.println(1);
                }
            }
        }
    }
}